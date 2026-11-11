.class public Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/は〲ぱなで/〻ぞまぎな〻$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final 〺つふすそ:Z

.field public static final くし〴〺ぅ:Z

.field public static final げつ〴ぬぐ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x13

    if-lt v0, v3, :cond_a

    const/4 v3, 0x1

    goto :goto_b

    :cond_a
    const/4 v3, 0x0

    :goto_b
    sput-boolean v3, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->げつ〴ぬぐ:Z

    const/16 v3, 0x12

    if-lt v0, v3, :cond_13

    const/4 v3, 0x1

    goto :goto_14

    :cond_13
    const/4 v3, 0x0

    :goto_14
    sput-boolean v3, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->〺つふすそ:Z

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_1b

    goto :goto_1c

    :cond_1b
    const/4 v1, 0x0

    :goto_1c
    sput-boolean v1, Lづざかべべ/は〲ぱなで/〻ぞまぎな〻;->くし〴〺ぅ:Z

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;
    .registers 5

    if-nez p0, :cond_3

    return-object p1

    :cond_3
    if-nez p1, :cond_6

    return-object p0

    :cond_6
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/animation/Animator;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v0
.end method
