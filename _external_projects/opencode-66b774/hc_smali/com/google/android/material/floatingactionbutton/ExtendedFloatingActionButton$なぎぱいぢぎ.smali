.class public Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation


# instance fields
.field public final synthetic 〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public ぁごぐすすぃ:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-direct {p0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;)V

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

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->ぁごぐすすぃ:Z

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    const/4 v0, 0x1

    .line 5
    iput v0, p1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->は〲ぱなで:I

    return-void
.end method

.method public 〺つふすそ()V
    .registers 3

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    const/4 v1, 0x0

    .line 2
    iput-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->ぁごぐすすぃ:Z

    return-void
.end method

.method public ぁごぐすすぃ()Z
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 1
    sget v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->びえぁぜい:I

    .line 2
    invoke-virtual {v0}, Landroid/widget/Button;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    iget v0, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->は〲ぱなで:I

    const/4 v3, 0x1

    if-nez v1, :cond_11

    if-ne v0, v3, :cond_15

    goto :goto_14

    :cond_11
    const/4 v1, 0x2

    if-eq v0, v1, :cond_15

    :goto_14
    const/4 v2, 0x1

    :cond_15
    return v2
.end method

.method public くし〴〺ぅ()I
    .registers 2

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;->mtrl_extended_fab_hide_motion_spec:I

    return v0
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    invoke-super {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->げつ〴ぬぐ()V

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    const/4 v1, 0x0

    .line 1
    iput v1, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->は〲ぱなで:I

    .line 2
    iget-boolean v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->ぁごぐすすぃ:Z

    if-nez v1, :cond_11

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_11
    return-void
.end method

.method public なぎぱいぢぎ(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぁごぐすすぃ;)V
    .registers 2

    if-nez p1, :cond_3

    return-void

    :cond_3
    const/4 p1, 0x0

    throw p1
.end method

.method public びぐびあび()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;->〳ぜぞぜべっ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method
