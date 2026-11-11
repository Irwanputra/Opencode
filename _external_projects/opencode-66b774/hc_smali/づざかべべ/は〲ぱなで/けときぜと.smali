.class public Lづざかべべ/は〲ぱなで/けときぜと;
.super Lづざかべべ/は〲ぱなで/ぷぞてのほき;
.source ""


# static fields
.field public static 〳ぜぞぜべっ:Z = true

.field public static ぁごぐすすぃ:Z = true

.field public static ぺぁあねじ:Z = true


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/ぷぞてのほき;-><init>()V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroid/view/View;Landroid/graphics/Matrix;)V
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/は〲ぱなで/けときぜと;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_b

    :try_start_4
    invoke-virtual {p1, p2}, Landroid/view/View;->transformMatrixToGlobal(Landroid/graphics/Matrix;)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_7} :catch_8

    goto :goto_b

    :catch_8
    const/4 p1, 0x0

    sput-boolean p1, Lづざかべべ/は〲ぱなで/けときぜと;->〳ぜぞぜべっ:Z

    :cond_b
    :goto_b
    return-void
.end method

.method public びぐびあび(Landroid/view/View;Landroid/graphics/Matrix;)V
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/は〲ぱなで/けときぜと;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_b

    :try_start_4
    invoke-virtual {p1, p2}, Landroid/view/View;->setAnimationMatrix(Landroid/graphics/Matrix;)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_7} :catch_8

    goto :goto_b

    :catch_8
    const/4 p1, 0x0

    sput-boolean p1, Lづざかべべ/は〲ぱなで/けときぜと;->ぁごぐすすぃ:Z

    :cond_b
    :goto_b
    return-void
.end method

.method public ぺぁあねじ(Landroid/view/View;Landroid/graphics/Matrix;)V
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/は〲ぱなで/けときぜと;->ぺぁあねじ:Z

    if-eqz v0, :cond_b

    :try_start_4
    invoke-virtual {p1, p2}, Landroid/view/View;->transformMatrixToLocal(Landroid/graphics/Matrix;)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_7} :catch_8

    goto :goto_b

    :catch_8
    const/4 p1, 0x0

    sput-boolean p1, Lづざかべべ/は〲ぱなで/けときぜと;->ぺぁあねじ:Z

    :cond_b
    :goto_b
    return-void
.end method
