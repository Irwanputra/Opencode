package p015.p025.p026;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p015.p025.p026.p027.AbstractC0985;
import p015.p025.p026.p028.C0986;
import p015.p025.p026.p028.C0987;
import p131.p155.p156.p157.C2098;

/* renamed from: いいにぽつ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0989 implements Closeable {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final String f5355 = System.getenv("LD_LIBRARY_PATH");

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Process f5357;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final BufferedReader f5359;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final DataOutputStream f5362;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<AbstractC0985> f5360 = new ArrayList();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f5361 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Runnable f5358 = new RunnableC0991();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Runnable f5356 = new RunnableC0990();

    /* renamed from: いいにぽつ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0990 implements Runnable {
        public RunnableC0990() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0989.m2320(C0989.this);
            } catch (IOException | InterruptedException unused) {
            }
        }
    }

    /* renamed from: いいにぽつ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0991 implements Runnable {
        public RunnableC0991() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0989.m2318(C0989.this);
            } catch (IOException unused) {
            }
        }
    }

    public C0989(String str, ArrayList<String> arrayList, String str2) {
        String readLine;
        int i = 0;
        Map<String, String> map = System.getenv();
        String[] strArr = new String[arrayList.size() + map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i] = entry.getKey() + "=" + entry.getValue();
            i++;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            strArr[i] = it.next();
            i++;
        }
        Runtime runtime = Runtime.getRuntime();
        Process exec = str2 == null ? runtime.exec(str, strArr, (File) null) : runtime.exec(str, strArr, new File(str2));
        this.f5357 = exec;
        this.f5359 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
        this.f5362 = dataOutputStream;
        dataOutputStream.write("echo Started\n".getBytes());
        dataOutputStream.flush();
        do {
            readLine = this.f5359.readLine();
            if (readLine == null) {
                throw new C0986("stdout line is null! Access was denied or this executeable is not a shell!");
            }
        } while ("".equals(readLine));
        if (!"Started".equals(readLine)) {
            try {
                this.f5357.exitValue();
            } catch (IllegalThreadStateException unused) {
                this.f5357.destroy();
            }
            throw new IOException(C2098.m4187("Unable to start shell, unexpected output \"", readLine, "\""));
        }
        new Thread(this.f5358, "Shell Input").start();
        new Thread(this.f5356, "Shell Output").start();
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static void m2318(C0989 c0989) {
        DataOutputStream dataOutputStream;
        c0989.getClass();
        int i = 0;
        while (true) {
            try {
                synchronized (c0989.f5360) {
                    while (!c0989.f5361 && i >= c0989.f5360.size()) {
                        c0989.f5360.wait();
                    }
                    dataOutputStream = c0989.f5362;
                }
                if (i < c0989.f5360.size()) {
                    c0989.f5360.get(i).m2317(dataOutputStream);
                    dataOutputStream.write(("\necho F*D^W@#FGF " + i + " $?\n").getBytes());
                    dataOutputStream.flush();
                    i++;
                } else {
                    if (c0989.f5361) {
                        dataOutputStream.write("\nexit 0\n".getBytes());
                        dataOutputStream.flush();
                        c0989.f5357.waitFor();
                        dataOutputStream.close();
                        return;
                    }
                    Thread.sleep(50L);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static C0989 m2319() {
        String str;
        ArrayList arrayList = new ArrayList();
        StringBuilder m4207 = C2098.m4207("LD_LIBRARY_PATH=");
        m4207.append(f5355);
        arrayList.add(m4207.toString());
        String[] strArr = C0987.f5354;
        int length = strArr.length;
        int i = 0;
        while (true) {
            str = "su";
            if (i >= length) {
                break;
            }
            File file = new File(C2098.m4205(strArr[i], "su"));
            if (file.exists()) {
                str = file.getAbsolutePath();
                break;
            }
            i++;
        }
        return new C0989(str, arrayList, null);
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static void m2320(C0989 c0989) {
        AbstractC0985 abstractC0985 = null;
        int i = 0;
        while (true) {
            String readLine = c0989.f5359.readLine();
            if (readLine == null) {
                break;
            }
            if (abstractC0985 == null) {
                if (i < c0989.f5360.size()) {
                    abstractC0985 = c0989.f5360.get(i);
                } else if (c0989.f5361) {
                    break;
                }
            }
            int indexOf = readLine.indexOf("F*D^W@#FGF");
            if (indexOf > 0) {
                String substring = readLine.substring(0, indexOf);
                abstractC0985.getClass();
                if (substring.contains("Value too large for defined data type")) {
                    abstractC0985.f5349 = true;
                }
                abstractC0985.mo2315(abstractC0985.f5351, substring);
            }
            if (indexOf >= 0) {
                readLine = readLine.substring(indexOf);
                String[] split = readLine.split(" ");
                if (Integer.parseInt(split[1]) == i) {
                    int parseInt = Integer.parseInt(split[2]);
                    synchronized (abstractC0985) {
                        abstractC0985.f5353 = parseInt;
                        abstractC0985.f5348 = true;
                        abstractC0985.notifyAll();
                    }
                    i++;
                    abstractC0985 = null;
                }
            }
            abstractC0985.getClass();
            if (readLine.contains("Value too large for defined data type")) {
                abstractC0985.f5349 = true;
            }
            abstractC0985.mo2315(abstractC0985.f5351, readLine);
        }
        c0989.f5357.waitFor();
        c0989.f5359.close();
        try {
            c0989.f5357.exitValue();
        } catch (IllegalThreadStateException unused) {
            c0989.f5357.destroy();
        }
        while (i < c0989.f5360.size()) {
            if (abstractC0985 == null) {
                abstractC0985 = c0989.f5360.get(i);
            }
            abstractC0985.m2316("Unexpected Termination!");
            i++;
            abstractC0985 = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f5360) {
            this.f5361 = true;
            this.f5360.notifyAll();
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public AbstractC0985 m2321(AbstractC0985 abstractC0985) {
        if (this.f5361) {
            throw new IOException("Unable to add commands to a closed shell");
        }
        synchronized (this.f5360) {
            this.f5360.add(abstractC0985);
            int size = this.f5360.size() - 1;
            abstractC0985.f5352 = this;
            abstractC0985.f5351 = size;
            this.f5360.notifyAll();
        }
        return abstractC0985;
    }
}
