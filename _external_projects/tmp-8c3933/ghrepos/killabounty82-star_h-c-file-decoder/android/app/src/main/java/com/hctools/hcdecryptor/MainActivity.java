package com.hctools.hcdecryptor;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.documentfile.provider.DocumentFile;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private static final int PICK_FILE_REQUEST = 1;
    private TextView statusText;
    private TextView resultText;
    private Button selectButton;
    private ProgressBar progressBar;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();
        checkPermissions();
    }

    private void initializeUI() {
        statusText = findViewById(R.id.statusText);
        resultText = findViewById(R.id.resultText);
        selectButton = findViewById(R.id.selectButton);
        progressBar = findViewById(R.id.progressBar);
        scrollView = findViewById(R.id.scrollView);

        selectButton.setOnClickListener(v -> openFilePicker());

        statusText.setText("Ready to decrypt. Select an .h.c file.");
    }

    private void checkPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            statusText.append("\n\n⚠️ Android 11+ detected. Please enable 'All Files Access' in settings.");
        }
    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        startActivityForResult(intent, PICK_FILE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_FILE_REQUEST && resultCode == RESULT_OK && data != null) {
            Uri uri = data.getData();
            if (uri != null) {
                decryptFile(uri);
            }
        }
    }

    private void decryptFile(Uri fileUri) {
        progressBar.setVisibility(View.VISIBLE);
        selectButton.setEnabled(false);
        resultText.setText("");
        statusText.setText("Decrypting...");

        new Thread(() -> {
            try {
                InputStream inputStream = getContentResolver().openInputStream(fileUri);
                byte[] fileContents = new byte[inputStream.available()];
                inputStream.read(fileContents);
                inputStream.close();

                DocumentFile documentFile = DocumentFile.fromSingleUri(this, fileUri);
                String fileName = documentFile.getName();

                runOnUiThread(() -> statusText.setText("File: " + fileName + "\nAttempting decryption with embedded keys..."));

                DecryptionEngine.DecryptResult result = DecryptionEngine.tryDecrypt(fileContents);

                runOnUiThread(() -> {
                    if (result.success) {
                        displayResult(result);
                    } else {
                        statusText.setText("❌ Decryption Failed\n\nNo matching key found.");
                    }
                    progressBar.setVisibility(View.GONE);
                    selectButton.setEnabled(true);
                });

            } catch (Exception e) {
                runOnUiThread(() -> {
                    statusText.setText("❌ Error: " + e.getMessage());
                    progressBar.setVisibility(View.GONE);
                    selectButton.setEnabled(true);
                });
            }
        }).start();
    }

    private void displayResult(DecryptionEngine.DecryptResult result) {
        java.util.Map<String, String> config = DecryptionEngine.parseConfig(result.content);

        StringBuilder output = new StringBuilder();
        output.append("✅ DECRYPTION SUCCESSFUL\n\n");
        output.append("Key Used: ").append(result.usedKey).append("\n");
        output.append("━━━━━━━━━━━━━━━━━━━━━━━━━\n\n");
        output.append("CONFIGURATION:\n\n");

        for (java.util.Map.Entry<String, String> entry : config.entrySet()) {
            output.append("📌 ").append(entry.getKey()).append(":\n");
            String value = entry.getValue().trim();
            if (value.length() > 200) {
                output.append(value, 0, 200).append("...\n\n");
            } else {
                output.append(value).append("\n\n");
            }
        }

        statusText.setText("✓ Decrypted successfully with key: " + result.usedKey);
        resultText.setText(output.toString());
        scrollView.post(() -> scrollView.scrollTo(0, 0));
    }
}
