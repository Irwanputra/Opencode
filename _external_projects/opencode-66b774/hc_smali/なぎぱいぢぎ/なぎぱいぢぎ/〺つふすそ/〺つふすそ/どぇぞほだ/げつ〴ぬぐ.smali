.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    .line 1
    iget-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->ぺふねづ〺:[I

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getLocationOnScreen([I)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    .line 3
    iget-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->ぺふねづ〺:[I

    const/4 v2, 0x1

    .line 4
    aget v1, v1, v2

    const/4 v3, 0x0

    if-nez v1, :cond_13

    const/4 v1, 0x1

    goto :goto_14

    :cond_13
    const/4 v1, 0x0

    .line 5
    :goto_14
    iget-object v0, v0, Lcom/google/android/material/navigation/NavigationView;->〳ぜぞぜべっ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;

    .line 6
    iget-boolean v4, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぉざぅち〻:Z

    if-eq v4, v1, :cond_1f

    iput-boolean v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->ぉざぅち〻:Z

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/びぐびあび;->へぬ〴づぞ()V

    .line 7
    :cond_1f
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {v0, v1}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->setDrawTopInsetForeground(Z)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 8
    :goto_2a
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_3c

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_35

    check-cast v0, Landroid/app/Activity;

    goto :goto_3d

    :cond_35
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_2a

    :cond_3c
    const/4 v0, 0x0

    :goto_3d
    if-eqz v0, :cond_77

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v1, v4, :cond_77

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v4

    if-ne v1, v4, :cond_5a

    const/4 v1, 0x1

    goto :goto_5b

    :cond_5a
    const/4 v1, 0x0

    :goto_5b
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_6b

    const/4 v0, 0x1

    goto :goto_6c

    :cond_6b
    const/4 v0, 0x0

    :goto_6c
    iget-object v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/どぇぞほだ/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    if-eqz v1, :cond_73

    if-eqz v0, :cond_73

    goto :goto_74

    :cond_73
    const/4 v2, 0x0

    :goto_74
    invoke-virtual {v4, v2}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->setDrawBottomInsetForeground(Z)V

    :cond_77
    return-void
.end method
