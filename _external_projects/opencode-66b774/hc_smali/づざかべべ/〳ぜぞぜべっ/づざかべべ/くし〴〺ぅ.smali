.class public Lづざかべべ/〳ぜぞぜべっ/づざかべべ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/app/Application;

.field public final synthetic くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/くし〴〺ぅ;->〺つふすそ:Landroid/app/Application;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/くし〴〺ぅ;->〺つふすそ:Landroid/app/Application;

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
