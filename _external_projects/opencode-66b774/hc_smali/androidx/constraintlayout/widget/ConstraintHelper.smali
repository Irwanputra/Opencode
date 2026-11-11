.class public abstract Landroidx/constraintlayout/widget/ConstraintHelper;
.super Landroid/view/View;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:[Landroid/view/View;

.field public 〺つふすそ:[I

.field public ぁごぐすすぃ:Ljava/lang/String;

.field public くし〴〺ぅ:I

.field public づざかべべ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public びぐびあび:Landroid/content/Context;

.field public ぺぁあねじ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x20

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぺぁあねじ:Ljava/util/HashMap;

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x20

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぺぁあねじ:Ljava/util/HashMap;

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x20

    new-array p3, p3, [I

    iput-object p3, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    const/4 p3, 0x0

    iput-object p3, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぺぁあねじ:Ljava/util/HashMap;

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public getReferencedIds()[I
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz v0, :cond_a

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->setIds(Ljava/lang/String;)V

    :cond_a
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぁごぐすすぃ:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->setReferenceTags(Ljava/lang/String;)V

    :cond_11
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    return-void
.end method

.method public onMeasure(II)V
    .registers 3

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setIds(Ljava/lang/String;)V
    .registers 5

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ:Ljava/lang/String;

    if-nez p1, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    :goto_8
    const/16 v1, 0x2c

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_19

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->づざかべべ(Ljava/lang/String;)V

    return-void

    :cond_19
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->づざかべべ(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    goto :goto_8
.end method

.method public setReferenceTags(Ljava/lang/String;)V
    .registers 5

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぁごぐすすぃ:Ljava/lang/String;

    if-nez p1, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    :goto_8
    const/16 v1, 0x2c

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_19

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->ぁごぐすすぃ(Ljava/lang/String;)V

    return-void

    :cond_19
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->ぁごぐすすぃ(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    goto :goto_8
.end method

.method public setReferencedIds([I)V
    .registers 4

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    :goto_6
    array-length v1, p1

    if-ge v0, v1, :cond_11

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_11
    return-void
.end method

.method public setTag(ILjava/lang/Object;)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez p2, :cond_c

    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ:Ljava/lang/String;

    if-nez p2, :cond_c

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ(I)V

    :cond_c
    return-void
.end method

.method public 〳ぜぞぜべっ()V
    .registers 9

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_42

    instance-of v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v1, :cond_42

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    const/4 v4, 0x0

    if-lt v2, v3, :cond_1c

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v2

    goto :goto_1d

    :cond_1c
    const/4 v2, 0x0

    :goto_1d
    const/4 v5, 0x0

    :goto_1e
    iget v6, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    if-ge v5, v6, :cond_42

    iget-object v6, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    aget v6, v6, v5

    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->びぐびあび(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_3f

    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    cmpl-float v7, v2, v4

    if-lez v7, :cond_3f

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v3, :cond_3f

    invoke-virtual {v6}, Landroid/view/View;->getTranslationZ()F

    move-result v7

    add-float/2addr v7, v2

    invoke-virtual {v6, v7}, Landroid/view/View;->setTranslationZ(F)V

    :cond_3f
    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    :cond_42
    return-void
.end method

.method public final ぁごぐすすぃ(Ljava/lang/String;)V
    .registers 8

    if-eqz p1, :cond_5a

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_9

    goto :goto_5a

    :cond_9
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    if-nez v0, :cond_e

    return-void

    :cond_e
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v1, :cond_21

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    :cond_21
    if-nez v0, :cond_24

    return-void

    :cond_24
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_29
    if-ge v2, v1, :cond_5a

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v5, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz v5, :cond_57

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iget-object v4, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->ごまけがぢは:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_57

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_50

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    goto :goto_57

    :cond_50
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ(I)V

    :cond_57
    :goto_57
    add-int/lit8 v2, v2, 0x1

    goto :goto_29

    :cond_5a
    :goto_5a
    return-void
.end method

.method public final いいにぽつ(Ljava/lang/String;)I
    .registers 7

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    goto :goto_11

    :cond_10
    move-object v0, v1

    :goto_11
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_28

    if-eqz v0, :cond_28

    invoke-virtual {v0, v3, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->くし〴〺ぅ(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_28

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_28
    if-nez v3, :cond_30

    if-eqz v0, :cond_30

    invoke-virtual {p0, v0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->ぺぁあねじ(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v3

    :cond_30
    if-nez v3, :cond_3e

    :try_start_32
    const-class v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/づざかべべ;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3
    :try_end_3c
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_3c} :catch_3d

    goto :goto_3e

    :catch_3d
    nop

    :cond_3e
    :goto_3e
    if-nez v3, :cond_52

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    :cond_52
    return v3
.end method

.method public ぇぬぎばつ()V
    .registers 1

    return-void
.end method

.method public ぉざぅち〻(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .registers 2

    return-void
.end method

.method public おぐぴう〸ず(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .registers 2

    return-void
.end method

.method public ざとぅぼこ〺(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;Landroid/util/SparseArray;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063;",
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u3073\u3050\u3073\u3042\u3073;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;->くし〴〺ぅ()V

    const/4 v0, 0x0

    :goto_4
    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    if-ge v0, v1, :cond_18

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    aget v1, v1, v0

    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-interface {p1, v1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;->げつ〴ぬぐ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_18
    return-void
.end method

.method public final づざかべべ(Ljava/lang/String;)V
    .registers 5

    if-eqz p1, :cond_32

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_9

    goto :goto_32

    :cond_9
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    if-nez v0, :cond_e

    return-void

    :cond_e
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_20

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    :cond_20
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->いいにぽつ(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_32

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぺぁあねじ:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ(I)V

    :cond_32
    :goto_32
    return-void
.end method

.method public てぜきぽく(Landroid/util/AttributeSet;)V
    .registers 6

    if-eqz p1, :cond_38

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v0, :cond_35

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_constraint_referenced_ids:I

    if-ne v2, v3, :cond_25

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/widget/ConstraintHelper;->setIds(Ljava/lang/String;)V

    goto :goto_32

    :cond_25
    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_constraint_referenced_tags:I

    if-ne v2, v3, :cond_32

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->ぁごぐすすぃ:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/widget/ConstraintHelper;->setReferenceTags(Ljava/lang/String;)V

    :cond_32
    :goto_32
    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    :cond_35
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_38
    return-void
.end method

.method public final なぎぱいぢぎ(I)V
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    if-ne p1, v0, :cond_7

    return-void

    :cond_7
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    array-length v2, v1

    if-le v0, v2, :cond_19

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    :cond_19
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    return-void
.end method

.method public のぷのちつ(Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺぁあねじ;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u304f\u3057\u3034\u303a\u3045$\u3052\u3064\u3034\u306c\u3050;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u307a\u3041\u3042\u306d\u3058;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;",
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u3073\u3050\u3073\u3042\u3073;",
            ">;)V"
        }
    .end annotation

    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;

    iget-object v0, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->はつきどっ:[I

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->setReferencedIds([I)V

    goto :goto_47

    :cond_b
    iget-object p3, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->〱かけばぜぐ:Ljava/lang/String;

    if-eqz p3, :cond_47

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_47

    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;

    iget-object v0, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->〱かけばぜぐ:Ljava/lang/String;

    const-string v2, ","

    .line 1
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    array-length v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_27
    array-length v5, v0

    if-ge v3, v5, :cond_3e

    aget-object v5, v0, v3

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Landroidx/constraintlayout/widget/ConstraintHelper;->いいにぽつ(Ljava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_3b

    add-int/lit8 v6, v4, 0x1

    aput v5, v2, v4

    move v4, v6

    :cond_3b
    add-int/lit8 v3, v3, 0x1

    goto :goto_27

    :cond_3e
    array-length v0, v0

    if-eq v4, v0, :cond_45

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    .line 2
    :cond_45
    iput-object v2, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->はつきどっ:[I

    :cond_47
    :goto_47
    invoke-virtual {p2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺぁあねじ;->くし〴〺ぅ()V

    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;

    iget-object p3, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->はつきどっ:[I

    if-eqz p3, :cond_67

    :goto_50
    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;

    iget-object p3, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->はつきどっ:[I

    array-length v0, p3

    if-ge v1, v0, :cond_67

    aget p3, p3, v1

    invoke-virtual {p4, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    if-eqz p3, :cond_64

    invoke-virtual {p2, p3}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺぁあねじ;->げつ〴ぬぐ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;)V

    :cond_64
    add-int/lit8 v1, v1, 0x1

    goto :goto_50

    :cond_67
    return-void
.end method

.method public は〲ぱなで()V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->づざかべべ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz v1, :cond_15

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->づざかべべ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    :cond_15
    return-void
.end method

.method public へぬ〴づぞ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;Z)V
    .registers 3

    return-void
.end method

.method public final ぺぁあねじ(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I
    .registers 10

    const/4 v0, 0x0

    if-eqz p2, :cond_3a

    if-nez p1, :cond_6

    goto :goto_3a

    :cond_6
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->びぐびあび:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-nez v1, :cond_f

    return v0

    :cond_f
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_14
    if-ge v3, v2, :cond_3a

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_37

    const/4 v5, 0x0

    :try_start_22
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v5
    :try_end_2a
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_22 .. :try_end_2a} :catch_2b

    goto :goto_2c

    :catch_2b
    nop

    :goto_2c
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_37

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result p1

    return p1

    :cond_37
    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_3a
    :goto_3a
    return v0
.end method

.method public ぺふねづ〺(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;
    .registers 5

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    if-eqz v0, :cond_9

    array-length v0, v0

    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    if-eq v0, v1, :cond_f

    :cond_9
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    :cond_f
    const/4 v0, 0x0

    :goto_10
    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    if-ge v0, v1, :cond_23

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〺つふすそ:[I

    aget v1, v1, v0

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->びぐびあび(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_23
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->〳ぜぞぜべっ:[Landroid/view/View;

    return-object p1
.end method
