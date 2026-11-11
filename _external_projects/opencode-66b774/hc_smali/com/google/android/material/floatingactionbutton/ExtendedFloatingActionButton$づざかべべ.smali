.class public Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Z

.field public final ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

.field public final synthetic ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;


# direct methods
.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;Z)V
    .registers 5

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-direct {p0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;)V

    iput-object p3, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    iput-boolean p4, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->〳ぜぞぜべっ:Z

    return-void
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    .line 2
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 3
    :cond_9
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    .line 4
    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->〳ぜぞぜべっ:Z

    .line 5
    iput-boolean v0, p1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setHorizontallyScrolling(Z)V

    return-void
.end method

.method public ぁごぐすすぃ()Z
    .registers 4

    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->〳ぜぞぜべっ:Z

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 1
    iget-boolean v2, v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    if-eq v0, v2, :cond_1d

    .line 2
    invoke-virtual {v1}, Lcom/google/android/material/button/MaterialButton;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_1d

    :cond_1b
    const/4 v0, 0x0

    goto :goto_1e

    :cond_1d
    :goto_1d
    const/4 v0, 0x1

    :goto_1e
    return v0
.end method

.method public くし〴〺ぅ()I
    .registers 2

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;->mtrl_extended_fab_change_size_motion_spec:I

    return v0
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    invoke-super {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->げつ〴ぬぐ()V

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setHorizontallyScrolling(Z)V

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_12

    return-void

    :cond_12
    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    invoke-interface {v1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    invoke-interface {v1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-void
.end method

.method public づざかべべ()Landroid/animation/AnimatorSet;
    .registers 10

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->ぺぁあねじ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v0

    const-string v1, "width"

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_31

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->づざかべべ(Ljava/lang/String;)[Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    aget-object v6, v2, v5

    new-array v7, v4, [F

    iget-object v8, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {v8}, Landroid/widget/Button;->getWidth()I

    move-result v8

    int-to-float v8, v8

    aput v8, v7, v5

    iget-object v8, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    invoke-interface {v8}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;->getWidth()I

    move-result v8

    int-to-float v8, v8

    aput v8, v7, v3

    invoke-virtual {v6, v7}, Landroid/animation/PropertyValuesHolder;->setFloatValues([F)V

    .line 1
    iget-object v6, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v6, v1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_31
    const-string v1, "height"

    .line 2
    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5b

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->づざかべべ(Ljava/lang/String;)[Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    aget-object v6, v2, v5

    new-array v4, v4, [F

    iget-object v7, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {v7}, Landroid/widget/Button;->getHeight()I

    move-result v7

    int-to-float v7, v7

    aput v7, v4, v5

    iget-object v5, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    invoke-interface {v5}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;->getHeight()I

    move-result v5

    int-to-float v5, v5

    aput v5, v4, v3

    invoke-virtual {v6, v4}, Landroid/animation/PropertyValuesHolder;->setFloatValues([F)V

    .line 3
    iget-object v3, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v3, v1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_5b
    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)Landroid/animation/AnimatorSet;

    move-result-object v0

    return-object v0
.end method

.method public なぎぱいぢぎ(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぁごぐすすぃ;)V
    .registers 3

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->〳ぜぞぜべっ:Z

    const/4 v0, 0x0

    throw v0
.end method

.method public びぐびあび()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    iget-boolean v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->〳ぜぞぜべっ:Z

    .line 1
    iput-boolean v1, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    .line 2
    invoke-virtual {v0}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    invoke-interface {v1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぁごぐすすぃ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;

    invoke-interface {v1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;->ぺぁあねじ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/Button;->requestLayout()V

    return-void
.end method
