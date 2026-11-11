.class public Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;
.super Lcom/google/android/material/button/MaterialButton;
.source ""

# interfaces
.implements Landroidx/coordinatorlayout/widget/CoordinatorLayout$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;,
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$〳ぜぞぜべっ;,
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;,
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;,
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;,
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぁごぐすすぃ;
    }
.end annotation


# static fields
.field public static final どぇぞほだ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final なぶひせが:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final びえぁぜい:I


# instance fields
.field public final 〻ぞまぎな〻:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

.field public ぇ〳〲〺すっ:Z

.field public final ぉ〲なぱぽた:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
            "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;",
            ">;"
        }
    .end annotation
.end field

.field public final ごづごきえ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

.field public final ざっざへづ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

.field public final でどあくず:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

.field public は〲ぱなで:I

.field public final ぶでにく〼〳:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const-class v0, Ljava/lang/Float;

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_ExtendedFloatingActionButton_Icon:I

    sput v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->びえぁぜい:I

    new-instance v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$くし〴〺ぅ;

    const-string v2, "width"

    invoke-direct {v1, v0, v2}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$くし〴〺ぅ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->なぶひせが:Landroid/util/Property;

    new-instance v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$びぐびあび;

    const-string v2, "height"

    invoke-direct {v1, v0, v2}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$びぐびあび;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->どぇぞほだ:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->extendedFloatingActionButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v8, p3

    sget v9, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->びえぁぜい:I

    move-object/from16 v1, p1

    invoke-static {v1, v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v7, v8}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v10, 0x0

    iput v10, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->は〲ぱなで:I

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    invoke-direct {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ごづごきえ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    new-instance v11, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$〳ぜぞぜべっ;

    invoke-direct {v11, v0, v1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$〳ぜぞぜべっ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;)V

    iput-object v11, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぶでにく〼〳:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    new-instance v12, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;

    invoke-direct {v12, v0, v1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$なぎぱいぢぎ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;)V

    iput-object v12, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->〻ぞまぎな〻:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    const/4 v13, 0x1

    iput-boolean v13, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    invoke-virtual/range {p0 .. p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v14

    new-instance v1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;

    invoke-direct {v1, v14, v7}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぉ〲なぱぽた:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    sget-object v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ExtendedFloatingActionButton:[I

    new-array v6, v10, [I

    move-object v1, v14

    move-object/from16 v2, p2

    move/from16 v4, p3

    move v5, v9

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ExtendedFloatingActionButton_showMotionSpec:I

    invoke-static {v14, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ExtendedFloatingActionButton_hideMotionSpec:I

    invoke-static {v14, v1, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v3

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ExtendedFloatingActionButton_extendMotionSpec:I

    invoke-static {v14, v1, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v4

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ExtendedFloatingActionButton_shrinkMotionSpec:I

    invoke-static {v14, v1, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v5

    new-instance v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;

    invoke-direct {v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;-><init>()V

    new-instance v15, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;

    new-instance v10, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$げつ〴ぬぐ;

    invoke-direct {v10, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$げつ〴ぬぐ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;)V

    invoke-direct {v15, v0, v6, v10, v13}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;Z)V

    iput-object v15, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->でどあくず:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    new-instance v10, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;

    new-instance v13, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$〺つふすそ;

    invoke-direct {v13, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$〺つふすそ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;)V

    const/4 v7, 0x0

    invoke-direct {v10, v0, v6, v13, v7}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$づざかべべ;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/げつ〴ぬぐ;Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぺぁあねじ;Z)V

    iput-object v10, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ざっざへづ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    .line 1
    iput-object v2, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    iput-object v3, v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    iput-object v4, v15, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    iput-object v5, v10, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    .line 2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->のぷのちつ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/くし〴〺ぅ;

    move-object/from16 v2, p2

    invoke-static {v14, v2, v8, v9, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;IILなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/くし〴〺ぅ;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;

    move-result-object v1

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setShapeAppearanceModel(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    return-void
.end method

.method public static づざかべべ(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->ぁごぐすすぃ()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_4e

    .line 2
    :cond_a
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_19

    invoke-virtual {p0}, Landroid/widget/Button;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_19

    const/4 v0, 0x1

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    if-nez v0, :cond_24

    .line 3
    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->びぐびあび()V

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->なぎぱいぢぎ(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ぁごぐすすぃ;)V

    goto :goto_4e

    :cond_24
    invoke-virtual {p0, v1, v1}, Landroid/widget/Button;->measure(II)V

    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->づざかべべ()Landroid/animation/AnimatorSet;

    move-result-object v0

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/びぐびあび;

    invoke-direct {v1, p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/びぐびあび;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 4
    iget-object p0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->くし〴〺ぅ:Ljava/util/ArrayList;

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_3b

    :cond_4b
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :goto_4e
    return-void
.end method


# virtual methods
.method public getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
            "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぉ〲なぱぽた:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    return-object v0
.end method

.method public getCollapsedSize()I
    .registers 3

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->は〲ぱなで(Landroid/view/View;)I

    move-result v0

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ざとぅぼこ〺(Landroid/view/View;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getIconSize()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public getExtendMotionSpec()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->でどあくず:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-object v0
.end method

.method public getHideMotionSpec()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->〻ぞまぎな〻:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-object v0
.end method

.method public getShowMotionSpec()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぶでにく〼〳:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-object v0
.end method

.method public getShrinkMotionSpec()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ざっざへづ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Lcom/google/android/material/button/MaterialButton;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    if-eqz v0, :cond_1f

    invoke-virtual {p0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ざっざへづ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    invoke-interface {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->びぐびあび()V

    :cond_1f
    return-void
.end method

.method public setExtendMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->でどあくず:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-void
.end method

.method public setExtendMotionSpecResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setExtendMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V

    return-void
.end method

.method public setExtended(Z)V
    .registers 3

    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぇ〳〲〺すっ:Z

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->でどあくず:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    goto :goto_c

    :cond_a
    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ざっざへづ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    :goto_c
    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->ぁごぐすすぃ()Z

    move-result v0

    if-eqz v0, :cond_13

    return-void

    :cond_13
    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;->びぐびあび()V

    return-void
.end method

.method public setHideMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->〻ぞまぎな〻:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-void
.end method

.method public setHideMotionSpecResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setHideMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V

    return-void
.end method

.method public setShowMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ぶでにく〼〳:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-void
.end method

.method public setShowMotionSpecResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setShowMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V

    return-void
.end method

.method public setShrinkMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->ざっざへづ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/てぜきぽく;

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    return-void
.end method

.method public setShrinkMotionSpecResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setShrinkMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V

    return-void
.end method
