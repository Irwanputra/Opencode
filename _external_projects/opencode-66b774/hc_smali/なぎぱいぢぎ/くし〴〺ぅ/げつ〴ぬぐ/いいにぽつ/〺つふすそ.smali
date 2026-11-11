.class public Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;


# direct methods
.method public constructor <init>(Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;->〺つふすそ:Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/String;

    move-result-object v0

    :cond_b
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v1, :cond_20

    aget-object v3, v0, v2

    invoke-static {v3}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/びぐびあび;->げつ〴ぬぐ(Ljava/io/File;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    :cond_20
    iget-object v0, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;->〺つふすそ:Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;

    new-instance v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
