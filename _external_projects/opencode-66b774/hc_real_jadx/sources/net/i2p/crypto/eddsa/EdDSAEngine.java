package net.i2p.crypto.eddsa;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.ScalarOps;
import p131.p155.p156.p157.C2098;
import sun.security.x509.X509Key;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class EdDSAEngine extends Signature {
    public static final AlgorithmParameterSpec ONE_SHOT_MODE = new OneShotSpec();
    public static final String SIGNATURE_ALGORITHM = "NONEwithEdDSA";
    private ByteArrayOutputStream baos;
    private MessageDigest digest;
    private EdDSAKey key;
    private byte[] oneShotBytes;
    private int oneShotLength;
    private boolean oneShotMode;
    private int oneShotOffset;

    public static class OneShotSpec implements AlgorithmParameterSpec {
        private OneShotSpec() {
        }
    }

    public EdDSAEngine() {
        super(SIGNATURE_ALGORITHM);
    }

    public EdDSAEngine(MessageDigest messageDigest) {
        this();
        this.digest = messageDigest;
    }

    private void digestInitSign(EdDSAPrivateKey edDSAPrivateKey) {
        int bVar = edDSAPrivateKey.getParams().getCurve().getField().getb();
        int i = bVar / 8;
        this.digest.update(edDSAPrivateKey.getH(), i, (bVar / 4) - i);
    }

    private void reset() {
        MessageDigest messageDigest = this.digest;
        if (messageDigest != null) {
            messageDigest.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = this.baos;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.reset();
        }
        this.oneShotMode = false;
        this.oneShotBytes = null;
    }

    private byte[] x_engineSign() {
        byte[] byteArray;
        int length;
        Curve curve = this.key.getParams().getCurve();
        ScalarOps scalarOps = this.key.getParams().getScalarOps();
        byte[] aVar = ((EdDSAPrivateKey) this.key).geta();
        int i = 0;
        if (this.oneShotMode) {
            byteArray = this.oneShotBytes;
            if (byteArray == null) {
                throw new SignatureException("update() not called first");
            }
            i = this.oneShotOffset;
            length = this.oneShotLength;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.baos;
            byteArray = byteArrayOutputStream == null ? new byte[0] : byteArrayOutputStream.toByteArray();
            length = byteArray.length;
        }
        this.digest.update(byteArray, i, length);
        byte[] reduce = scalarOps.reduce(this.digest.digest());
        byte[] byteArray2 = this.key.getParams().getB().scalarMultiply(reduce).toByteArray();
        this.digest.update(byteArray2);
        this.digest.update(((EdDSAPrivateKey) this.key).getAbyte());
        this.digest.update(byteArray, i, length);
        byte[] multiplyAndAdd = scalarOps.multiplyAndAdd(scalarOps.reduce(this.digest.digest()), aVar, reduce);
        ByteBuffer allocate = ByteBuffer.allocate(curve.getField().getb() / 4);
        allocate.put(byteArray2).put(multiplyAndAdd);
        return allocate.array();
    }

    private boolean x_engineVerify(byte[] bArr) {
        byte[] byteArray;
        int length;
        int i;
        int bVar = this.key.getParams().getCurve().getField().getb();
        int i2 = bVar / 4;
        if (bArr.length != i2) {
            throw new SignatureException("signature length is wrong");
        }
        int i3 = bVar / 8;
        this.digest.update(bArr, 0, i3);
        this.digest.update(((EdDSAPublicKey) this.key).getAbyte());
        if (this.oneShotMode) {
            byteArray = this.oneShotBytes;
            if (byteArray == null) {
                throw new SignatureException("update() not called first");
            }
            i = this.oneShotOffset;
            length = this.oneShotLength;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.baos;
            byteArray = byteArrayOutputStream == null ? new byte[0] : byteArrayOutputStream.toByteArray();
            length = byteArray.length;
            i = 0;
        }
        this.digest.update(byteArray, i, length);
        byte[] byteArray2 = this.key.getParams().getB().doubleScalarMultiplyVariableTime(((EdDSAPublicKey) this.key).getNegativeA(), this.key.getParams().getScalarOps().reduce(this.digest.digest()), Arrays.copyOfRange(bArr, i3, i2)).toByteArray();
        for (int i4 = 0; i4 < byteArray2.length; i4++) {
            if (byteArray2[i4] != bArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        reset();
        if (!(privateKey instanceof EdDSAPrivateKey)) {
            StringBuilder m4207 = C2098.m4207("cannot identify EdDSA private key: ");
            m4207.append(privateKey.getClass());
            throw new InvalidKeyException(m4207.toString());
        }
        EdDSAPrivateKey edDSAPrivateKey = (EdDSAPrivateKey) privateKey;
        this.key = edDSAPrivateKey;
        if (this.digest == null) {
            try {
                this.digest = MessageDigest.getInstance(edDSAPrivateKey.getParams().getHashAlgorithm());
            } catch (NoSuchAlgorithmException unused) {
                StringBuilder m42072 = C2098.m4207("cannot get required digest ");
                m42072.append(this.key.getParams().getHashAlgorithm());
                m42072.append(" for private key.");
                throw new InvalidKeyException(m42072.toString());
            }
        } else if (!edDSAPrivateKey.getParams().getHashAlgorithm().equals(this.digest.getAlgorithm())) {
            throw new InvalidKeyException("Key hash algorithm does not match chosen digest");
        }
        digestInitSign(edDSAPrivateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        reset();
        if (!(publicKey instanceof EdDSAPublicKey)) {
            if (!(publicKey instanceof X509Key)) {
                StringBuilder m4207 = C2098.m4207("cannot identify EdDSA public key: ");
                m4207.append(publicKey.getClass());
                throw new InvalidKeyException(m4207.toString());
            }
            try {
                engineInitVerify(new EdDSAPublicKey(new X509EncodedKeySpec(publicKey.getEncoded())));
                return;
            } catch (InvalidKeySpecException unused) {
                StringBuilder m42072 = C2098.m4207("cannot handle X.509 EdDSA public key: ");
                m42072.append(publicKey.getAlgorithm());
                throw new InvalidKeyException(m42072.toString());
            }
        }
        EdDSAPublicKey edDSAPublicKey = (EdDSAPublicKey) publicKey;
        this.key = edDSAPublicKey;
        if (this.digest != null) {
            if (!edDSAPublicKey.getParams().getHashAlgorithm().equals(this.digest.getAlgorithm())) {
                throw new InvalidKeyException("Key hash algorithm does not match chosen digest");
            }
            return;
        }
        try {
            this.digest = MessageDigest.getInstance(edDSAPublicKey.getParams().getHashAlgorithm());
        } catch (NoSuchAlgorithmException unused2) {
            StringBuilder m42073 = C2098.m4207("cannot get required digest ");
            m42073.append(this.key.getParams().getHashAlgorithm());
            m42073.append(" for private key.");
            throw new InvalidKeyException(m42073.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!algorithmParameterSpec.equals(ONE_SHOT_MODE)) {
            super.engineSetParameter(algorithmParameterSpec);
        } else {
            if (this.oneShotBytes != null || ((byteArrayOutputStream = this.baos) != null && byteArrayOutputStream.size() > 0)) {
                throw new InvalidAlgorithmParameterException("update() already called");
            }
            this.oneShotMode = true;
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            return x_engineSign();
        } finally {
            reset();
            digestInitSign((EdDSAPrivateKey) this.key);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        if (this.oneShotMode) {
            throw new SignatureException("unsupported in one-shot mode");
        }
        if (this.baos == null) {
            this.baos = new ByteArrayOutputStream(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        this.baos.write(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        if (!this.oneShotMode) {
            if (this.baos == null) {
                this.baos = new ByteArrayOutputStream(NotificationCompat.FLAG_LOCAL_ONLY);
            }
            this.baos.write(bArr, i, i2);
        } else {
            if (this.oneShotBytes != null) {
                throw new SignatureException("update() already called");
            }
            this.oneShotBytes = bArr;
            this.oneShotOffset = i;
            this.oneShotLength = i2;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        try {
            return x_engineVerify(bArr);
        } finally {
            reset();
        }
    }

    public byte[] signOneShot(byte[] bArr) {
        return signOneShot(bArr, 0, bArr.length);
    }

    public byte[] signOneShot(byte[] bArr, int i, int i2) {
        this.oneShotMode = true;
        update(bArr, i, i2);
        return sign();
    }

    public boolean verifyOneShot(byte[] bArr, int i, int i2, byte[] bArr2) {
        return verifyOneShot(bArr, i, i2, bArr2, 0, bArr2.length);
    }

    public boolean verifyOneShot(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        this.oneShotMode = true;
        update(bArr, i, i2);
        return verify(bArr2, i3, i4);
    }

    public boolean verifyOneShot(byte[] bArr, byte[] bArr2) {
        return verifyOneShot(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public boolean verifyOneShot(byte[] bArr, byte[] bArr2, int i, int i2) {
        return verifyOneShot(bArr, 0, bArr.length, bArr2, i, i2);
    }
}
