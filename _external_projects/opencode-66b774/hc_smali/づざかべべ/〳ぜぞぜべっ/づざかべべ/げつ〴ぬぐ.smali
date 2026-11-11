.class public Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;
.super Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$くし〴〺ぅ;,
        Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$〺つふすそ;
    }
.end annotation


# static fields
.field public static final synthetic くし〴〺ぅ:I


# direct methods
.method public static づざかべべ(Landroid/app/Activity;Ljava/lang/String;)Z
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_b

    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public static びぐびあび(Landroid/app/Activity;[Ljava/lang/String;I)V
    .registers 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_14

    instance-of v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$くし〴〺ぅ;

    if-eqz v0, :cond_10

    move-object v0, p0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$くし〴〺ぅ;

    invoke-interface {v0, p2}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$くし〴〺ぅ;->びぐびあび(I)V

    :cond_10
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_29

    :cond_14
    instance-of v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$〺つふすそ;

    if-eqz v0, :cond_29

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v1, p1, p0, p2}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>([Ljava/lang/String;Landroid/app/Activity;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_29
    :goto_29
    return-void
.end method
