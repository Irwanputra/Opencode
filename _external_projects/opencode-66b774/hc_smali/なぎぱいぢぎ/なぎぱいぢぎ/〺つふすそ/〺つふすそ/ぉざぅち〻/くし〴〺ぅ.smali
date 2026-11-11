.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

.field public final synthetic くし〴〺ぅ:I

.field public げつ〴ぬぐ:Z

.field public final synthetic づざかべべ:Lcom/google/android/material/bottomappbar/BottomAppBar;

.field public final synthetic びぐびあび:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar;Landroidx/appcompat/widget/ActionMenuView;IZ)V
    .registers 5

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->づざかべべ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iput p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->くし〴〺ぅ:I

    iput-boolean p4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->びぐびあび:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 6

    iget-boolean p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->げつ〴ぬぐ:Z

    if-nez p1, :cond_16

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->づざかべべ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->くし〴〺ぅ:I

    iget-boolean v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;->びぐびあび:Z

    .line 1
    sget v3, Lcom/google/android/material/bottomappbar/BottomAppBar;->きぬどぼみ〸:I

    .line 2
    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->じぜこほぱ(Landroidx/appcompat/widget/ActionMenuView;IZ)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setTranslationX(F)V

    :cond_16
    return-void
.end method
