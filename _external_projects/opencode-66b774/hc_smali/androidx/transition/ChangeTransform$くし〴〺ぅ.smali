.class public Landroidx/transition/ChangeTransform$くし〴〺ぅ;
.super Lづざかべべ/は〲ぱなで/ざっざへづ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;

.field public げつ〴ぬぐ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;)V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/ざっざへづ;-><init>()V

    iput-object p1, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/view/View;

    iput-object p2, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Landroidx/transition/Transition;)V
    .registers 3

    iget-object p1, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;

    const/4 v0, 0x4

    invoke-interface {p1, v0}, Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;->setVisibility(I)V

    return-void
.end method

.method public づざかべべ(Landroidx/transition/Transition;)V
    .registers 9

    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    iget-object p1, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/view/View;

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4c

    .line 2
    sget-boolean v0, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->〳ぜぞぜべっ:Z

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_35

    .line 3
    :try_start_12
    sget-boolean v0, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->びぐびあび:Z
    :try_end_14
    .catch Ljava/lang/NoSuchMethodException; {:try_start_12 .. :try_end_14} :catch_33

    if-nez v0, :cond_20

    :try_start_16
    const-string v0, "android.view.GhostView"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/Class;
    :try_end_1e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_16 .. :try_end_1e} :catch_1e
    .catch Ljava/lang/NoSuchMethodException; {:try_start_16 .. :try_end_1e} :catch_33

    :catch_1e
    :try_start_1e
    sput-boolean v3, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->びぐびあび:Z

    .line 4
    :cond_20
    sget-object v0, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/Class;

    const-string v4, "removeGhost"

    new-array v5, v3, [Ljava/lang/Class;

    const-class v6, Landroid/view/View;

    aput-object v6, v5, v1

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->ぁごぐすすぃ:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_33
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1e .. :try_end_33} :catch_33

    :catch_33
    sput-boolean v3, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->〳ぜぞぜべっ:Z

    .line 5
    :cond_35
    sget-object v0, Lづざかべべ/は〲ぱなで/ぺぁあねじ;->ぁごぐすすぃ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_69

    :try_start_39
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_40
    .catch Ljava/lang/IllegalAccessException; {:try_start_39 .. :try_end_40} :catch_69
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_39 .. :try_end_40} :catch_41

    goto :goto_69

    :catch_41
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 6
    :cond_4c
    sget v0, Lづざかべべ/は〲ぱなで/いいにぽつ;->〳ぜぞぜべっ:I

    .line 7
    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/は〲ぱなで/いいにぽつ;

    if-eqz p1, :cond_69

    .line 8
    iget v0, p1, Lづざかべべ/は〲ぱなで/いいにぽつ;->づざかべべ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Lづざかべべ/は〲ぱなで/いいにぽつ;->づざかべべ:I

    if-gtz v0, :cond_69

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 9
    :catch_69
    :cond_69
    :goto_69
    iget-object p1, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/view/View;

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_transform:I

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/view/View;

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->parent_matrix:I

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public びぐびあび(Landroidx/transition/Transition;)V
    .registers 3

    iget-object p1, p0, Landroidx/transition/ChangeTransform$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;->setVisibility(I)V

    return-void
.end method
