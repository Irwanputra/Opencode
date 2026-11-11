.class public Lづざかべべ/は〲ぱなで/おかぷせ〱;
.super Lづざかべべ/は〲ぱなで/けときぜと;
.source ""


# static fields
.field public static いいにぽつ:Z = true


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/けときぜと;-><init>()V

    return-void
.end method


# virtual methods
.method public づざかべべ(Landroid/view/View;IIII)V
    .registers 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/は〲ぱなで/おかぷせ〱;->いいにぽつ:Z

    if-eqz v0, :cond_b

    :try_start_4
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setLeftTopRightBottom(IIII)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_7} :catch_8

    goto :goto_b

    :catch_8
    const/4 p1, 0x0

    sput-boolean p1, Lづざかべべ/は〲ぱなで/おかぷせ〱;->いいにぽつ:Z

    :cond_b
    :goto_b
    return-void
.end method
