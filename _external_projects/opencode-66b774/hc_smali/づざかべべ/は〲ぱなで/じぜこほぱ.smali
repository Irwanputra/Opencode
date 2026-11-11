.class public Lづざかべべ/は〲ぱなで/じぜこほぱ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:Ljava/lang/reflect/Method; = null

.field public static くし〴〺ぅ:Z = false

.field public static げつ〴ぬぐ:Z = true


# direct methods
.method public static 〺つふすそ(Landroid/view/ViewGroup;Z)V
    .registers 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_b

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->suppressLayout(Z)V

    goto/16 :goto_be

    :cond_b
    const/16 v1, 0x12

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1d

    .line 1
    sget-boolean v0, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_be

    :try_start_14
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->suppressLayout(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodError; {:try_start_14 .. :try_end_17} :catch_19

    goto/16 :goto_be

    :catch_19
    sput-boolean v2, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ:Z

    goto/16 :goto_be

    .line 2
    :cond_1d
    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_44

    new-instance v0, Lづざかべべ/は〲ぱなで/ぺづげぺが;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/ぺづげぺが;-><init>()V

    sput-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    invoke-virtual {v0, v2, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    invoke-virtual {v0, v1, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    const/4 v4, 0x3

    invoke-virtual {v0, v4, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    const/4 v4, 0x4

    invoke-virtual {v0, v4, v3}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    :cond_44
    if-eqz p1, :cond_81

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object p1

    if-eqz p1, :cond_7b

    invoke-virtual {p1}, Landroid/animation/LayoutTransition;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_72

    .line 3
    sget-boolean v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_67

    :try_start_56
    const-class v0, Landroid/animation/LayoutTransition;

    const-string v3, "cancel"

    new-array v4, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁごぐすすぃ:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_65
    .catch Ljava/lang/NoSuchMethodException; {:try_start_56 .. :try_end_65} :catch_65

    :catch_65
    sput-boolean v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->〳ぜぞぜべっ:Z

    :cond_67
    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁごぐすすぃ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_72

    :try_start_6b
    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_70
    .catch Ljava/lang/IllegalAccessException; {:try_start_6b .. :try_end_70} :catch_71
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6b .. :try_end_70} :catch_71

    goto :goto_72

    :catch_71
    nop

    .line 4
    :cond_72
    :goto_72
    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    if-eq p1, v0, :cond_7b

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_layout_save:I

    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    :cond_7b
    sget-object p1, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび:Landroid/animation/LayoutTransition;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    goto :goto_be

    :cond_81
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    sget-boolean p1, Lづざかべべ/は〲ぱなで/〺つふすそ;->なぎぱいぢぎ:Z

    if-nez p1, :cond_97

    :try_start_88
    const-class p1, Landroid/view/ViewGroup;

    const-string v0, "mLayoutSuppressed"

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    sput-object p1, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ:Ljava/lang/reflect/Field;

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_95
    .catch Ljava/lang/NoSuchFieldException; {:try_start_88 .. :try_end_95} :catch_95

    :catch_95
    sput-boolean v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->なぎぱいぢぎ:Z

    :cond_97
    sget-object p1, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ:Ljava/lang/reflect/Field;

    if-eqz p1, :cond_a9

    :try_start_9b
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result p1
    :try_end_9f
    .catch Ljava/lang/IllegalAccessException; {:try_start_9b .. :try_end_9f} :catch_a8

    if-eqz p1, :cond_a6

    :try_start_a1
    sget-object v0, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_a6
    .catch Ljava/lang/IllegalAccessException; {:try_start_a1 .. :try_end_a6} :catch_a6

    :catch_a6
    :cond_a6
    move v2, p1

    goto :goto_a9

    :catch_a8
    nop

    :cond_a9
    :goto_a9
    if-eqz v2, :cond_ae

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_ae
    sget p1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_layout_save:I

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/LayoutTransition;

    if-eqz v0, :cond_be

    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    :cond_be
    :goto_be
    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_c

    new-instance v0, Lづざかべべ/は〲ぱなで/どぇぞほだ;

    invoke-direct {v0, p0}, Lづざかべべ/は〲ぱなで/どぇぞほだ;-><init>(Landroid/view/ViewGroup;)V

    return-object v0

    .line 1
    :cond_c
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/ぉひのべい;->くし〴〺ぅ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/ぉひのべい;

    move-result-object p0

    check-cast p0, Lづざかべべ/は〲ぱなで/なぶひせが;

    return-object p0
.end method
