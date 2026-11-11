.class public abstract Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;


# instance fields
.field public final 〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public final くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

.field public なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

.field public final びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->くし〴〺ぅ:Ljava/util/ArrayList;

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    invoke-virtual {p1}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 2
    :cond_9
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    return-void
.end method

.method public 〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)Landroid/animation/AnimatorSet;
    .registers 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "opacity"

    invoke-virtual {p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    sget-object v3, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-virtual {p1, v1, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->びぐびあび(Ljava/lang/String;Ljava/lang/Object;Landroid/util/Property;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    const-string v1, "scale"

    invoke-virtual {p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_36

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    sget-object v3, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    invoke-virtual {p1, v1, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->びぐびあび(Ljava/lang/String;Ljava/lang/Object;Landroid/util/Property;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    sget-object v3, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    invoke-virtual {p1, v1, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->びぐびあび(Ljava/lang/String;Ljava/lang/Object;Landroid/util/Property;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_36
    const-string v1, "width"

    invoke-virtual {p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_49

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    sget-object v3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->なぶひせが:Landroid/util/Property;

    invoke-virtual {p1, v1, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->びぐびあび(Ljava/lang/String;Ljava/lang/Object;Landroid/util/Property;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_49
    const-string v1, "height"

    invoke-virtual {p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5c

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    sget-object v3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->どぇぞほだ:Landroid/util/Property;

    invoke-virtual {p1, v1, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->びぐびあび(Ljava/lang/String;Ljava/lang/Object;Landroid/util/Property;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5c
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-static {p1, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->きぬどぼみ〸(Landroid/animation/AnimatorSet;Ljava/util/List;)V

    return-object p1
.end method

.method public 〺つふすそ()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    const/4 v1, 0x0

    .line 1
    iput-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    const/4 v1, 0x0

    .line 1
    iput-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/Animator;

    return-void
.end method

.method public づざかべべ()Landroid/animation/AnimatorSet;
    .registers 2

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->ぺぁあねじ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v0

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)Landroid/animation/AnimatorSet;

    move-result-object v0

    return-object v0
.end method

.method public final ぺぁあねじ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    if-nez v0, :cond_15

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-interface {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->くし〴〺ぅ()I

    move-result v1

    invoke-static {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v0

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    :cond_15
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
