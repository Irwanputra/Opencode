package dev.epro.r0;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I16767837074657364535 implements S13153454375869416672 {
    public static final Pattern b = Pattern.compile("HTTP/\\S+\\s(\\d+)\\s(.*)\\s*");
    public final G5793569464912558238 a;

    public I16767837074657364535(G5793569464912558238 g5793569464912558238) {
        this.a = g5793569464912558238;
    }

    @Override // dev.epro.r0.S13153454375869416672
    public final void a(Socket socket, String str, int i, int i2) {
        G5793569464912558238 g5793569464912558238 = this.a;
        String str2 = g5793569464912558238.a;
        socket.connect(new InetSocketAddress(str2, g5793569464912558238.b), i2);
        String str3 = "CONNECT " + str + ":" + i;
        String str4 = g5793569464912558238.c;
        if (str4 != null) {
            G6547577305291411977.s(str4, ":", (String) g5793569464912558238.d).getBytes(StandardCharsets.UTF_8);
            throw null;
        }
        socket.getOutputStream().write((str3 + " HTTP/1.1\r\nHost: " + str + ":" + i + "\r\n\r\n").getBytes(StandardCharsets.UTF_8));
        InputStream inputStream = socket.getInputStream();
        StringBuilder sb = new StringBuilder(100);
        int i3 = 0;
        do {
            int read = inputStream.read();
            if (read == -1) {
                throw new Y951392678894847155("Proxy Exception HTTP : Unknown Error");
            }
            char c = (char) read;
            sb.append(c);
            if (sb.length() > 1024) {
                throw new Y951392678894847155(1, G6547577305291411977.s("Received header of >1024 characters from ", str2, ", cancelling connection"));
            }
            i3 = (((i3 == 0 || i3 == 2) && c == '\r') || ((i3 == 1 || i3 == 3) && c == '\n')) ? i3 + 1 : 0;
        } while (i3 != 4);
        if (i3 != 4) {
            throw new Y951392678894847155(1, G6547577305291411977.s("Never received blank line from ", str2, ", cancelling connection"));
        }
        String readLine = new BufferedReader(new StringReader(sb.toString())).readLine();
        if (readLine == null) {
            throw new Y951392678894847155(1, G6547577305291411977.s("Empty proxy response from ", str2, ", cancelling"));
        }
        Matcher matcher = b.matcher(readLine);
        if (!matcher.matches()) {
            throw new Y951392678894847155(1, G6547577305291411977.t("Unexpected proxy response from ", str2, ": ", readLine));
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt != 200) {
            throw new Y951392678894847155(1, G6547577305291411977.n(parseInt, "Error code in proxy response: "));
        }
    }
}
