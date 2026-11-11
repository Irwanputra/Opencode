.class public Lづざかべべ/は〲ぱなで/ぷぞてのほき;
.super Lづざかべべ/は〲ぱなで/げがぴうあだ;
.source ""


# static fields
.field public static なぎぱいぢぎ:Z = true


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)F
    .registers 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/は〲ぱなで/ぷぞてのほき;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_c

    :try_start_4
    invoke-virtual {p1}, Landroid/view/View;->getTransitionAlpha()F

    move-result p1
    :try_end_8
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_8} :catch_9

    return p1

    :catch_9
    const/4 v0, 0x0

    sput-boolean v0, Lづざかべべ/は〲ぱなで/ぷぞてのほき;->なぎぱいぢぎ:Z

    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    return p1
.end method

.method public くし〴〺ぅ(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public なぎぱいぢぎ(Landroid/view/View;F)V
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/は〲ぱなで/ぷぞてのほき;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_b

    :try_start_4
    invoke-virtual {p1, p2}, Landroid/view/View;->setTransitionAlpha(F)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_7} :catch_8

    return-void

    :catch_8
    const/4 v0, 0x0

    sput-boolean v0, Lづざかべべ/は〲ぱなで/ぷぞてのほき;->なぎぱいぢぎ:Z

    :cond_b
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method
