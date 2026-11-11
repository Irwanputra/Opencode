.class public Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〳ぜぞぜべっ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$びぐびあび;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$〺つふすそ;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$くし〴〺ぅ;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$ぁごぐすすぃ;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;
    }
.end annotation


# static fields
.field public static final 〻ぞまぎな〻:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public static final ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f/\u304f\u3057\u3034\u303a\u3045<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field public static final ぉ〲なぱぽた:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static final でどあくず:Ljava/lang/String;

.field public static final ぶでにく〼〳:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final 〳ぜぞぜべっ:[I

.field public final 〺つふすそ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final ぁごぐすすぃ:[I

.field public いいにぽつ:Z

.field public ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:Z

.field public final くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3041\u3054\u3050\u3059\u3059\u3043/\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public ごづごきえ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;

.field public final ざっざへづ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

.field public ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

.field public final づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public てぜきぽく:Landroid/view/View;

.field public なぎぱいぢぎ:Landroid/graphics/Paint;

.field public のぷのちつ:Landroid/view/View;

.field public は〲ぱなで:Landroid/view/ViewGroup$OnHierarchyChangeListener;

.field public final びぐびあび:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const-class v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    :cond_e
    move-object v0, v1

    :goto_f
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->でどあくず:Ljava/lang/String;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_1f

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$ぁごぐすすぃ;

    invoke-direct {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$ぁごぐすすぃ;-><init>()V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉ〲なぱぽた:Ljava/util/Comparator;

    goto :goto_21

    :cond_1f
    sput-object v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉ〲なぱぽた:Ljava/util/Comparator;

    :goto_21
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/Context;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Landroid/util/AttributeSet;

    aput-object v2, v0, v1

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぶでにく〼〳:[Ljava/lang/Class;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〻ぞまぎな〻:Ljava/lang/ThreadLocal;

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;-><init>(I)V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/ぁごぐすすぃ/げつ〴ぬぐ;->coordinatorLayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 13

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    new-instance v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びぐびあび:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    const/4 v0, 0x2

    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〳ぜぞぜべっ:[I

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    const/4 v0, 0x0

    sget-object v1, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout:[I

    if-nez p3, :cond_3b

    sget v2, Lづざかべべ/ぁごぐすすぃ/〺つふすそ;->Widget_Support_CoordinatorLayout:I

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    goto :goto_3f

    :cond_3b
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    :goto_3f
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_5d

    sget-object v4, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout:[I

    if-nez p3, :cond_54

    const/4 v7, 0x0

    sget v8, Lづざかべべ/ぁごぐすすぃ/〺つふすそ;->Widget_Support_CoordinatorLayout:I

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, v1

    invoke-virtual/range {v2 .. v8}, Landroid/view/ViewGroup;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    goto :goto_5d

    :cond_54
    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, v1

    move v7, p3

    invoke-virtual/range {v2 .. v8}, Landroid/view/ViewGroup;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_5d
    :goto_5d
    sget p2, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_keylines:I

    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_87

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object p2

    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺふねづ〺:[I

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iget-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺふねづ〺:[I

    array-length p2, p2

    :goto_78
    if-ge v0, p2, :cond_87

    iget-object p3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺふねづ〺:[I

    aget v2, p3, v0

    int-to-float v2, v2

    mul-float v2, v2, p1

    float-to-int v2, v2

    aput v2, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_78

    :cond_87
    sget p1, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_statusBarBackground:I

    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぅみぱぎぎ()V

    new-instance p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$びぐびあび;

    invoke-direct {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$びぐびあび;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->へぬ〴づぞ(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_a7

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    :cond_a7
    return-void
.end method

.method public static づざかべべ()Landroid/graphics/Rect;
    .registers 1

    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_f

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    :cond_f
    return-object v0
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    instance-of v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    if-eqz v0, :cond_c

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    return p1
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 13

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v1, :cond_8c

    invoke-virtual {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->くし〴〺ぅ()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_8c

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぎぱいぢぎ:Landroid/graphics/Paint;

    if-nez v2, :cond_1e

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぎぱいぢぎ:Landroid/graphics/Paint;

    :cond_1e
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぎぱいぢぎ:Landroid/graphics/Paint;

    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->〺つふすそ()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぎぱいぢぎ:Landroid/graphics/Paint;

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0xff

    if-gez v1, :cond_3a

    const/4 v1, 0x0

    goto :goto_3e

    :cond_3a
    if-le v1, v3, :cond_3e

    const/16 v1, 0xff

    :cond_3e
    :goto_3e
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->isOpaque()Z

    move-result v1

    if-eqz v1, :cond_65

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v4, v1

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v6, v1

    sget-object v7, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    :cond_65
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    int-to-float v4, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v5, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v6, v1

    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぎぱいぢぎ:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_8c
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    return p1
.end method

.method public drawableStateChanged()V
    .registers 5

    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDrawableState()[I

    move-result-object v0

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v2, v0

    :cond_17
    if-eqz v2, :cond_1c

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_1c
    return-void
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 1
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 1
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 2
    instance-of v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    if-eqz v0, :cond_c

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-direct {v0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V

    goto :goto_1d

    :cond_c
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_18

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    goto :goto_1d

    :cond_18
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-direct {v0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1d
    return-object v0
.end method

.method public final getDependencySortedChildren()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ()V

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getLastWindowInsets()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .registers 2

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ()I

    move-result v0

    return v0
.end method

.method public getStatusBarBackground()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getSuggestedMinimumHeight()I
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public getSuggestedMinimumWidth()I
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public onAttachedToWindow()V
    .registers 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びえぁぜい(Z)V

    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->おぐぴう〸ず:Z

    if-eqz v0, :cond_1f

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    if-nez v0, :cond_16

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    :cond_16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_1f
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    if-nez v0, :cond_2c

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    :cond_2c
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->いいにぽつ:Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びえぁぜい(Z)V

    iget-boolean v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->おぐぴう〸ず:Z

    if-eqz v1, :cond_18

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    if-eqz v1, :cond_18

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_18
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->のぷのちつ:Landroid/view/View;

    if-eqz v1, :cond_1f

    invoke-virtual {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onStopNestedScroll(Landroid/view/View;)V

    :cond_1f
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->いいにぽつ:Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 6

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉざぅち〻:Z

    if-eqz v0, :cond_26

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_26

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    const/4 v1, 0x0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v0

    goto :goto_16

    :cond_15
    const/4 v0, 0x0

    :goto_16
    if-lez v0, :cond_26

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_26
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_a

    invoke-virtual {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びえぁぜい(Z)V

    :cond_a
    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉ〲なぱぽた(Landroid/view/MotionEvent;I)Z

    move-result p1

    if-eq v0, v1, :cond_14

    const/4 v2, 0x3

    if-ne v0, v2, :cond_17

    :cond_14
    invoke-virtual {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びえぁぜい(Z)V

    :cond_17
    return p1
.end method

.method public onLayout(ZIIII)V
    .registers 7

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result p1

    iget-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_b
    if-ge p3, p2, :cond_34

    iget-object p4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p5

    const/16 v0, 0x8

    if-ne p5, v0, :cond_1e

    goto :goto_31

    :cond_1e
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p5

    check-cast p5, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object p5, p5, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz p5, :cond_2e

    .line 2
    invoke-virtual {p5, p0, p4, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぺふねづ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z

    move-result p5

    if-nez p5, :cond_31

    :cond_2e
    invoke-virtual {p0, p4, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぶでにく〼〳(Landroid/view/View;I)V

    :cond_31
    :goto_31
    add-int/lit8 p3, p3, 0x1

    goto :goto_b

    :cond_34
    return-void
.end method

.method public onMeasure(II)V
    .registers 33

    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ()V

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v8, 0x0

    const/4 v1, 0x0

    :goto_b
    const/4 v2, 0x1

    if-ge v1, v0, :cond_38

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2
    iget-object v4, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 3
    iget-object v5, v4, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 4
    iget v5, v5, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v6, 0x0

    :goto_19
    if-ge v6, v5, :cond_30

    .line 5
    iget-object v9, v4, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v9, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    if-eqz v9, :cond_2d

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2d

    const/4 v3, 0x1

    goto :goto_31

    :cond_2d
    add-int/lit8 v6, v6, 0x1

    goto :goto_19

    :cond_30
    const/4 v3, 0x0

    :goto_31
    if-eqz v3, :cond_35

    const/4 v0, 0x1

    goto :goto_39

    :cond_35
    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_38
    const/4 v0, 0x0

    .line 6
    :goto_39
    iget-boolean v1, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->おぐぴう〸ず:Z

    if-eq v0, v1, :cond_6d

    if-eqz v0, :cond_5a

    .line 7
    iget-boolean v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->いいにぽつ:Z

    if-eqz v0, :cond_57

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    if-nez v0, :cond_4e

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    invoke-direct {v0, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    iput-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    :cond_4e
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_57
    iput-boolean v2, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->おぐぴう〸ず:Z

    goto :goto_6d

    .line 8
    :cond_5a
    iget-boolean v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->いいにぽつ:Z

    if-eqz v0, :cond_6b

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    if-eqz v0, :cond_6b

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_6b
    iput-boolean v8, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->おぐぴう〸ず:Z

    .line 9
    :cond_6d
    :goto_6d
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v11

    if-ne v11, v2, :cond_85

    const/4 v12, 0x1

    goto :goto_86

    :cond_85
    const/4 v12, 0x0

    :goto_86
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v13

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v14

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v15

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v16

    add-int v17, v9, v10

    add-int v18, v0, v1

    invoke-virtual/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getSuggestedMinimumHeight()I

    move-result v1

    iget-object v3, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    if-eqz v3, :cond_af

    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_af

    const/16 v19, 0x1

    goto :goto_b1

    :cond_af
    const/16 v19, 0x0

    :goto_b1
    iget-object v2, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    move v5, v0

    move v4, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_bb
    if-ge v3, v6, :cond_1d4

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/view/View;

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_d7

    move/from16 v22, v3

    move/from16 v29, v6

    move/from16 v28, v9

    goto/16 :goto_1cb

    :cond_d7
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget v0, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    if-ltz v0, :cond_121

    if-eqz v13, :cond_121

    invoke-virtual {v7, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->は〲ぱなで(I)I

    move-result v0

    iget v8, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    if-nez v8, :cond_ef

    const v8, 0x800035

    :cond_ef
    invoke-static {v8, v11}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v8

    and-int/lit8 v8, v8, 0x7

    move/from16 v22, v2

    const/4 v2, 0x3

    if-ne v8, v2, :cond_fc

    if-eqz v12, :cond_101

    :cond_fc
    const/4 v2, 0x5

    if-ne v8, v2, :cond_10d

    if-eqz v12, :cond_10d

    :cond_101
    sub-int v2, v14, v10

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move/from16 v21, v2

    const/4 v8, 0x0

    goto :goto_125

    :cond_10d
    if-ne v8, v2, :cond_111

    if-eqz v12, :cond_116

    :cond_111
    const/4 v2, 0x3

    if-ne v8, v2, :cond_11f

    if-eqz v12, :cond_11f

    :cond_116
    sub-int/2addr v0, v9

    const/4 v8, 0x0

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v21, v0

    goto :goto_125

    :cond_11f
    const/4 v8, 0x0

    goto :goto_123

    :cond_121
    move/from16 v22, v2

    :goto_123
    const/16 v21, 0x0

    :goto_125
    if-eqz v19, :cond_157

    invoke-static/range {v20 .. v20}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_157

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v0

    iget-object v2, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v2

    add-int/2addr v2, v0

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v0

    iget-object v8, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v8}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v8

    add-int/2addr v8, v0

    sub-int v0, v14, v2

    invoke-static {v0, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    sub-int v2, v16, v8

    invoke-static {v2, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    move v8, v0

    move/from16 v23, v2

    goto :goto_15b

    :cond_157
    move/from16 v8, p1

    move/from16 v23, p2

    .line 10
    :goto_15b
    iget-object v0, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v0, :cond_181

    const/16 v24, 0x0

    move-object v2, v1

    move-object/from16 v1, p0

    move-object/from16 v26, v2

    move/from16 v25, v22

    move-object/from16 v2, v20

    move/from16 v22, v3

    move v3, v8

    move/from16 v27, v4

    move/from16 v4, v21

    move/from16 v28, v9

    move v9, v5

    move/from16 v5, v23

    move/from16 v29, v6

    move/from16 v6, v24

    .line 11
    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->てぜきぽく(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z

    move-result v0

    if-nez v0, :cond_19b

    goto :goto_18e

    :cond_181
    move-object/from16 v26, v1

    move/from16 v27, v4

    move/from16 v29, v6

    move/from16 v28, v9

    move/from16 v25, v22

    move/from16 v22, v3

    move v9, v5

    :goto_18e
    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move v2, v8

    move/from16 v3, v21

    move/from16 v4, v23

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 13
    :cond_19b
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int v0, v0, v17

    move-object/from16 v1, v26

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int v2, v2, v18

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v1

    move/from16 v1, v27

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    move/from16 v8, v25

    invoke-static {v8, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    move v5, v0

    move v4, v1

    :goto_1cb
    add-int/lit8 v3, v22, 0x1

    move/from16 v9, v28

    move/from16 v6, v29

    const/4 v8, 0x0

    goto/16 :goto_bb

    :cond_1d4
    move v8, v2

    move v1, v4

    move v9, v5

    const/high16 v0, -0x1000000

    and-int/2addr v0, v8

    move/from16 v2, p1

    invoke-static {v9, v2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    shl-int/lit8 v2, v8, 0x10

    move/from16 v3, p2

    invoke-static {v1, v3, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    :goto_7
    if-ge p3, p1, :cond_2f

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_16

    goto :goto_2c

    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-virtual {v0, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ(I)Z

    move-result v1

    if-nez v1, :cond_23

    goto :goto_2c

    .line 1
    :cond_23
    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v0, :cond_2c

    .line 2
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->のぷのちつ()Z

    move-result v0

    or-int/2addr p4, v0

    :cond_2c
    :goto_2c
    add-int/lit8 p3, p3, 0x1

    goto :goto_7

    :cond_2f
    if-eqz p4, :cond_35

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->でどあくず(I)V

    :cond_35
    return p4
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 14

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_7
    if-ge v2, v0, :cond_33

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_16

    goto :goto_30

    :cond_16
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-virtual {v4, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ(I)Z

    move-result v5

    if-nez v5, :cond_23

    goto :goto_30

    .line 1
    :cond_23
    iget-object v4, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v4, :cond_30

    move-object v5, p0

    move-object v7, p1

    move v8, p2

    move v9, p3

    .line 2
    invoke-virtual/range {v4 .. v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->へぬ〴づぞ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z

    move-result v4

    or-int/2addr v3, v4

    :cond_30
    :goto_30
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_33
    return v3
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〳ぜぞぜべっ(Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 14

    .line 1
    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〳ぜぞぜべっ:[I

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺふねづ〺(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぎぱいぢぎ(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 8

    instance-of v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object p1, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->びぐびあび:Landroid/util/SparseArray;

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_16
    if-ge v0, v1, :cond_39

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {p0, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ごづごきえ(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    move-result-object v4

    .line 3
    iget-object v4, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    const/4 v5, -0x1

    if-eq v3, v5, :cond_36

    if-eqz v4, :cond_36

    .line 4
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    if-eqz v3, :cond_36

    invoke-virtual {v4, p0, v2, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ざっざへづ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V

    :cond_36
    add-int/lit8 v0, v0, 0x1

    goto :goto_16

    :cond_39
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 9

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;-><init>(Landroid/os/Parcelable;)V

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v2, :cond_36

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object v6, v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    const/4 v7, -0x1

    if-eq v5, v7, :cond_33

    if-eqz v6, :cond_33

    .line 2
    invoke-virtual {v6, p0, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->でどあくず(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;

    move-result-object v4

    if-eqz v4, :cond_33

    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_33
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_36
    iput-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->びぐびあび:Landroid/util/SparseArray;

    return-object v0
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->のぷのちつ(Landroid/view/View;Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ(Landroid/view/View;I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    iget-object v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->てぜきぽく:Landroid/view/View;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_15

    invoke-virtual {v0, v1, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉ〲なぱぽた(Landroid/view/MotionEvent;I)Z

    move-result v3

    if-eqz v3, :cond_29

    goto :goto_16

    :cond_15
    const/4 v3, 0x0

    :goto_16
    iget-object v6, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->てぜきぽく:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object v6, v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v6, :cond_29

    .line 2
    iget-object v7, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->てぜきぽく:Landroid/view/View;

    invoke-virtual {v6, v0, v7, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v6

    goto :goto_2a

    :cond_29
    const/4 v6, 0x0

    :goto_2a
    iget-object v7, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->てぜきぽく:Landroid/view/View;

    const/4 v8, 0x0

    if-nez v7, :cond_35

    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    or-int/2addr v6, v1

    goto :goto_48

    :cond_35
    if-eqz v3, :cond_48

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide v9, v11

    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v8

    invoke-super {v0, v8}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_48
    :goto_48
    if-eqz v8, :cond_4d

    invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V

    :cond_4d
    if-eq v2, v4, :cond_52

    const/4 v1, 0x3

    if-ne v2, v1, :cond_55

    :cond_52
    invoke-virtual {v0, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びえぁぜい(Z)V

    :cond_55
    return v6
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v0, :cond_12

    .line 2
    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ごづごきえ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 p1, 0x1

    return p1

    :cond_12
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result p1

    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    if-eqz p1, :cond_10

    iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺぁあねじ:Z

    if-nez p1, :cond_10

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びえぁぜい(Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺぁあねじ:Z

    :cond_10
    return-void
.end method

.method public setFitsSystemWindows(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setFitsSystemWindows(Z)V

    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぅみぱぎぎ()V

    return-void
.end method

.method public setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
    .registers 2

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->は〲ぱなで:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    return-void
.end method

.method public setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_4f

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_a
    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_10
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_40

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_23

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_23
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぉねぞはがぞ(Landroid/graphics/drawable/Drawable;I)Z

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_37

    const/4 v0, 0x1

    goto :goto_38

    :cond_37
    const/4 v0, 0x0

    :goto_38
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 1
    :cond_40
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_4c

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_4f

    :cond_4c
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_4f
    :goto_4f
    return-void
.end method

.method public setStatusBarBackgroundColor(I)V
    .registers 3

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStatusBarBackgroundResource(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setVisibility(I)V
    .registers 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eq v1, p1, :cond_18

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_18
    return-void
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 p1, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 p1, 0x1

    :goto_e
    return p1
.end method

.method public 〳ぜぞぜべっ(Landroid/view/View;II[II)V
    .registers 22

    move-object/from16 v8, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v10, 0x0

    const/4 v0, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_b
    const/4 v14, 0x1

    if-ge v11, v9, :cond_6c

    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_1d

    move/from16 v15, p5

    goto :goto_69

    :cond_1d
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    move/from16 v15, p5

    invoke-virtual {v1, v15}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ(I)Z

    move-result v3

    if-nez v3, :cond_2c

    goto :goto_69

    .line 1
    :cond_2c
    iget-object v1, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v1, :cond_69

    .line 2
    iget-object v6, v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    aput v10, v6, v10

    aput v10, v6, v14

    move-object v0, v1

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v7, p5

    invoke-virtual/range {v0 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぇぬぎばつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V

    iget-object v0, v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    if-lez p2, :cond_4f

    aget v0, v0, v10

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_55

    :cond_4f
    aget v0, v0, v10

    invoke-static {v12, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_55
    move v12, v0

    iget-object v0, v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    if-lez p3, :cond_61

    aget v0, v0, v14

    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_67

    :cond_61
    aget v0, v0, v14

    invoke-static {v13, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_67
    move v13, v0

    const/4 v0, 0x1

    :cond_69
    :goto_69
    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_6c
    aput v12, p4, v10

    aput v13, p4, v14

    if-eqz v0, :cond_75

    invoke-virtual {v8, v14}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->でどあくず(I)V

    :cond_75
    return-void
.end method

.method public 〻ぞまぎな〻(Landroid/view/View;IIII)V
    .registers 6

    invoke-virtual/range {p0 .. p5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

.method public ぁごぐすすぃ(Landroid/view/View;I)V
    .registers 9

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v2, :cond_9

    .line 1
    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->〺つふすそ:I

    goto :goto_b

    :cond_9
    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:I

    .line 2
    :goto_b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_10
    if-ge v2, v0, :cond_32

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-virtual {v4, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ(I)Z

    move-result v5

    if-nez v5, :cond_23

    goto :goto_2f

    .line 3
    :cond_23
    iget-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v5, :cond_2a

    .line 4
    invoke-virtual {v5, p0, v3, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぇ〳〲〺すっ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V

    .line 5
    :cond_2a
    invoke-virtual {v4, p2, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ(IZ)V

    .line 6
    iput-boolean v1, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぇぬぎばつ:Z

    :goto_2f
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_32
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->のぷのちつ:Landroid/view/View;

    return-void
.end method

.method public いいにぽつ(Landroid/view/View;)V
    .registers 6

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_30

    .line 4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_30

    const/4 v1, 0x0

    :goto_14
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_30

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 5
    iget-object v3, v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v3, :cond_2d

    .line 6
    invoke-virtual {v3, p0, v2, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぁごぐすすぃ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    :cond_2d
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_30
    return-void
.end method

.method public final ぅみぱぎぎ()V
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_7

    return-void

    :cond_7
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ごづごきえ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;

    if-nez v0, :cond_18

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$げつ〴ぬぐ;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ごづごきえ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;

    :cond_18
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ごづごきえ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;

    invoke-static {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ち〴みぎ〻び(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;)V

    const/16 v0, 0x500

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setSystemUiVisibility(I)V

    goto :goto_27

    :cond_23
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ち〴みぎ〻び(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;)V

    :goto_27
    return-void
.end method

.method public final ぇ〳〲〺すっ()V
    .registers 12

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 2
    iget v1, v1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_d
    if-ge v3, v1, :cond_24

    .line 3
    iget-object v4, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v4, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_21

    .line 4
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    iget-object v5, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v5, v4}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    .line 5
    :cond_24
    iget-object v0, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->clear()V

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_2e
    if-ge v1, v0, :cond_18d

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ごづごきえ(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    move-result-object v4

    .line 7
    iget v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-ne v5, v6, :cond_44

    iput-object v7, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    iput-object v7, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    goto/16 :goto_c2

    :cond_44
    iget-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    if-eqz v5, :cond_75

    .line 8
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    iget v6, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    if-eq v5, v6, :cond_51

    goto :goto_6e

    :cond_51
    iget-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    :goto_57
    if-eq v6, p0, :cond_70

    if-eqz v6, :cond_6a

    if-ne v6, v3, :cond_5e

    goto :goto_6a

    :cond_5e
    instance-of v8, v6, Landroid/view/View;

    if-eqz v8, :cond_65

    move-object v5, v6

    check-cast v5, Landroid/view/View;

    :cond_65
    invoke-interface {v6}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    goto :goto_57

    :cond_6a
    :goto_6a
    iput-object v7, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    iput-object v7, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    :goto_6e
    const/4 v5, 0x0

    goto :goto_73

    :cond_70
    iput-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    const/4 v5, 0x1

    :goto_73
    if-nez v5, :cond_c2

    .line 9
    :cond_75
    iget v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    if-eqz v5, :cond_b8

    if-ne v5, p0, :cond_90

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_88

    goto :goto_be

    :cond_88
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "View can not be anchored to the the parent CoordinatorLayout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_90
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    :goto_94
    if-eq v6, p0, :cond_b5

    if-eqz v6, :cond_b5

    if-ne v6, v3, :cond_a9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_a1

    goto :goto_be

    :cond_a1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Anchor must not be a descendant of the anchored view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a9
    instance-of v8, v6, Landroid/view/View;

    if-eqz v8, :cond_b0

    move-object v5, v6

    check-cast v5, Landroid/view/View;

    :cond_b0
    invoke-interface {v6}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    goto :goto_94

    :cond_b5
    iput-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    goto :goto_c2

    :cond_b8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_168

    :goto_be
    iput-object v7, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    iput-object v7, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    .line 10
    :cond_c2
    :goto_c2
    iget-object v5, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    invoke-virtual {v5, v3}, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;)V

    const/4 v5, 0x0

    :goto_c8
    if-ge v5, v0, :cond_164

    if-ne v5, v1, :cond_ce

    goto/16 :goto_160

    :cond_ce
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 11
    iget-object v8, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    if-eq v6, v8, :cond_103

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v8

    .line 12
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget v9, v9, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    invoke-static {v9, v8}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v9

    if-eqz v9, :cond_f3

    iget v10, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    invoke-static {v10, v8}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v8

    and-int/2addr v8, v9

    if-ne v8, v9, :cond_f3

    const/4 v8, 0x1

    goto :goto_f4

    :cond_f3
    const/4 v8, 0x0

    :goto_f4
    if-nez v8, :cond_103

    .line 13
    iget-object v8, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v8, :cond_101

    invoke-virtual {v8, p0, v3, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びぐびあび(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result v8

    if-eqz v8, :cond_101

    goto :goto_103

    :cond_101
    const/4 v8, 0x0

    goto :goto_104

    :cond_103
    :goto_103
    const/4 v8, 0x1

    :goto_104
    if-eqz v8, :cond_160

    .line 14
    iget-object v8, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 15
    iget-object v8, v8, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 16
    invoke-virtual {v8, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Ljava/lang/Object;)I

    move-result v8

    if-ltz v8, :cond_112

    const/4 v8, 0x1

    goto :goto_113

    :cond_112
    const/4 v8, 0x0

    :goto_113
    if-nez v8, :cond_11a

    .line 17
    iget-object v8, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    invoke-virtual {v8, v6}, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;)V

    :cond_11a
    iget-object v8, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 18
    iget-object v9, v8, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 19
    invoke-virtual {v9, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Ljava/lang/Object;)I

    move-result v9

    if-ltz v9, :cond_126

    const/4 v9, 0x1

    goto :goto_127

    :cond_126
    const/4 v9, 0x0

    :goto_127
    if-eqz v9, :cond_158

    .line 20
    iget-object v9, v8, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 21
    invoke-virtual {v9, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Ljava/lang/Object;)I

    move-result v9

    if-ltz v9, :cond_133

    const/4 v9, 0x1

    goto :goto_134

    :cond_133
    const/4 v9, 0x0

    :goto_134
    if-eqz v9, :cond_158

    .line 22
    iget-object v9, v8, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 23
    invoke-virtual {v9, v6, v7}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 24
    check-cast v9, Ljava/util/ArrayList;

    if-nez v9, :cond_154

    .line 25
    iget-object v9, v8, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v9}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    if-nez v9, :cond_14f

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 26
    :cond_14f
    iget-object v8, v8, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v8, v6, v9}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_154
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_160

    :cond_158
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "All nodes must be present in the graph before being added as an edge"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_160
    :goto_160
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_c8

    :cond_164
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2e

    .line 27
    :cond_168
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not find CoordinatorLayout descendant view with id "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v4, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to anchor view "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :cond_18d
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 29
    iget-object v3, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->びぐびあび:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    iget-object v3, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 30
    iget v3, v3, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    :goto_19f
    if-ge v2, v3, :cond_1b1

    .line 31
    iget-object v4, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v4, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    iget-object v6, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->びぐびあび:Ljava/util/HashSet;

    invoke-virtual {v1, v4, v5, v6}, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_19f

    :cond_1b1
    iget-object v1, v1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-void
.end method

.method public ぇぬぎばつ(Landroid/view/View;)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 3
    check-cast p1, Ljava/util/List;

    .line 4
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_17

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_17
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    return-object p1
.end method

.method public final ぉ〲なぱぽた(Landroid/view/MotionEvent;I)Z
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    iget-object v4, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->びぐびあび:Ljava/util/List;

    .line 1
    invoke-interface {v4}, Ljava/util/List;->clear()V

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isChildrenDrawingOrderEnabled()Z

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    add-int/lit8 v7, v6, -0x1

    :goto_19
    if-ltz v7, :cond_2d

    if-eqz v5, :cond_22

    invoke-virtual {v0, v6, v7}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result v8

    goto :goto_23

    :cond_22
    move v8, v7

    :goto_23
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, -0x1

    goto :goto_19

    :cond_2d
    sget-object v5, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉ〲なぱぽた:Ljava/util/Comparator;

    if-eqz v5, :cond_34

    invoke-static {v4, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2
    :cond_34
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_3d
    if-ge v8, v5, :cond_b9

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 3
    iget-object v13, v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    const/4 v14, 0x1

    if-nez v9, :cond_52

    if-eqz v10, :cond_77

    :cond_52
    if-eqz v3, :cond_77

    if-eqz v13, :cond_b6

    if-nez v6, :cond_6a

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v17

    const/16 v19, 0x3

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v15, v17

    invoke-static/range {v15 .. v22}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v6

    :cond_6a
    if-eqz v2, :cond_73

    if-eq v2, v14, :cond_6f

    goto :goto_b6

    :cond_6f
    invoke-virtual {v13, v0, v11, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_b6

    :cond_73
    invoke-virtual {v13, v0, v11, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->いいにぽつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_b6

    :cond_77
    if-nez v9, :cond_8d

    if-eqz v13, :cond_8d

    if-eqz v2, :cond_85

    if-eq v2, v14, :cond_80

    goto :goto_89

    :cond_80
    invoke-virtual {v13, v0, v11, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v9

    goto :goto_89

    :cond_85
    invoke-virtual {v13, v0, v11, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->いいにぽつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v9

    :goto_89
    if-eqz v9, :cond_8d

    iput-object v11, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->てぜきぽく:Landroid/view/View;

    .line 5
    :cond_8d
    iget-object v10, v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-nez v10, :cond_93

    iput-boolean v7, v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->のぷのちつ:Z

    :cond_93
    iget-boolean v11, v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->のぷのちつ:Z

    if-eqz v11, :cond_99

    const/4 v10, 0x1

    goto :goto_aa

    :cond_99
    if-eqz v10, :cond_a6

    .line 6
    invoke-virtual {v10}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->くし〴〺ぅ()F

    move-result v10

    const/4 v13, 0x0

    cmpl-float v10, v10, v13

    if-lez v10, :cond_a6

    const/4 v10, 0x1

    goto :goto_a7

    :cond_a6
    const/4 v10, 0x0

    :goto_a7
    or-int/2addr v10, v11

    .line 7
    iput-boolean v10, v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->のぷのちつ:Z

    :goto_aa
    if-eqz v10, :cond_af

    if-nez v11, :cond_af

    goto :goto_b0

    :cond_af
    const/4 v14, 0x0

    :goto_b0
    if-eqz v10, :cond_b5

    if-nez v14, :cond_b5

    goto :goto_b9

    :cond_b5
    move v10, v14

    :cond_b6
    :goto_b6
    add-int/lit8 v8, v8, 0x1

    goto :goto_3d

    .line 8
    :cond_b9
    :goto_b9
    invoke-interface {v4}, Ljava/util/List;->clear()V

    return v9
.end method

.method public ぉざぅち〻(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 7

    .line 1
    sget-object v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 2
    sget-object v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    if-nez v1, :cond_21

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_24

    :cond_21
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    :goto_24
    invoke-static {p0, p1, v1}, Lづざかべべ/ぁごぐすすぃ/びぐびあび/〺つふすそ;->げつ〴ぬぐ(Landroid/view/ViewParent;Landroid/view/View;Landroid/graphics/Matrix;)V

    sget-object p1, Lづざかべべ/ぁごぐすすぃ/びぐびあび/〺つふすそ;->〺つふすそ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/RectF;

    if-nez v0, :cond_39

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_39
    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget p1, v0, Landroid/graphics/RectF;->left:F

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr p1, v1

    float-to-int p1, p1

    iget v2, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v1

    float-to-int v2, v2

    iget v3, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v3, v1

    float-to-int v3, v3

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p2, p1, v2, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public おぐぴう〸ず(Landroid/view/View;)Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->くし〴〺ぅ:Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 2
    iget v1, v1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v1, :cond_2d

    .line 3
    iget-object v4, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v4, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_2a

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    if-nez v2, :cond_21

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_21
    iget-object v4, v0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v4, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2a
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 4
    :cond_2d
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    if-eqz v2, :cond_39

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_39
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ:Ljava/util/List;

    return-object p1
.end method

.method public ごづごきえ(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;
    .registers 7

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    if-nez v1, :cond_6f

    instance-of v1, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$〺つふすそ;

    const/4 v2, 0x1

    if-eqz v1, :cond_28

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$〺つふすそ;

    invoke-interface {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$〺つふすそ;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p1

    .line 1
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eq v1, p1, :cond_6d

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぺぁあねじ()V

    :cond_1e
    iput-object p1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    iput-boolean v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    if-eqz p1, :cond_6d

    invoke-virtual {p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->なぎぱいぢぎ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V

    goto :goto_6d

    .line 2
    :cond_28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v1, 0x0

    :goto_2d
    if-eqz p1, :cond_3e

    const-class v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$くし〴〺ぅ;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$くし〴〺ぅ;

    if-nez v1, :cond_3e

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_2d

    :cond_3e
    if-eqz v1, :cond_6d

    :try_start_40
    invoke-interface {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$くし〴〺ぅ;->value()Ljava/lang/Class;

    move-result-object p1

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {p1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 3
    iget-object v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eq v3, p1, :cond_6d

    if-eqz v3, :cond_5c

    invoke-virtual {v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぺぁあねじ()V

    :cond_5c
    iput-object p1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    iput-boolean v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    if-eqz p1, :cond_6d

    invoke-virtual {p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->なぎぱいぢぎ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V
    :try_end_65
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_65} :catch_66

    goto :goto_6d

    .line 4
    :catch_66
    invoke-interface {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$くし〴〺ぅ;->value()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    :cond_6d
    :goto_6d
    iput-boolean v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    :cond_6f
    return-object v0
.end method

.method public ざっざへづ(Landroid/view/View;II)Z
    .registers 5

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉざぅち〻(Landroid/view/View;Landroid/graphics/Rect;)V

    :try_start_7
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1
    :try_end_b
    .catchall {:try_start_7 .. :try_end_b} :catchall_14

    .line 1
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    sget-object p2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {p2, v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    return p1

    :catchall_14
    move-exception p1

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    sget-object p2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {p2, v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    .line 2
    throw p1
.end method

.method public final ざとぅぼこ〺(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;II)V
    .registers 13

    iget v0, p4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    if-nez v0, :cond_6

    const/16 v0, 0x11

    :cond_6
    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v0

    iget p4, p4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    and-int/lit8 v1, p4, 0x7

    if-nez v1, :cond_14

    const v1, 0x800003

    or-int/2addr p4, v1

    :cond_14
    and-int/lit8 v1, p4, 0x70

    if-nez v1, :cond_1a

    or-int/lit8 p4, p4, 0x30

    :cond_1a
    invoke-static {p4, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result p1

    and-int/lit8 p4, v0, 0x7

    and-int/lit8 v0, v0, 0x70

    and-int/lit8 v1, p1, 0x7

    and-int/lit8 p1, p1, 0x70

    const/4 v2, 0x5

    const/4 v3, 0x1

    if-eq v1, v3, :cond_32

    if-eq v1, v2, :cond_2f

    iget v1, p2, Landroid/graphics/Rect;->left:I

    goto :goto_3b

    :cond_2f
    iget v1, p2, Landroid/graphics/Rect;->right:I

    goto :goto_3b

    :cond_32
    iget v1, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v4

    :goto_3b
    const/16 v4, 0x50

    const/16 v5, 0x10

    if-eq p1, v5, :cond_49

    if-eq p1, v4, :cond_46

    iget p1, p2, Landroid/graphics/Rect;->top:I

    goto :goto_52

    :cond_46
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_52

    :cond_49
    iget p1, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p1, p2

    :goto_52
    if-eq p4, v3, :cond_58

    if-eq p4, v2, :cond_5b

    sub-int/2addr v1, p5

    goto :goto_5b

    :cond_58
    div-int/lit8 p2, p5, 0x2

    sub-int/2addr v1, p2

    :cond_5b
    :goto_5b
    if-eq v0, v5, :cond_61

    if-eq v0, v4, :cond_64

    sub-int/2addr p1, p6

    goto :goto_64

    :cond_61
    div-int/lit8 p2, p6, 0x2

    sub-int/2addr p1, p2

    :cond_64
    :goto_64
    add-int/2addr p5, v1

    add-int/2addr p6, p1

    invoke-virtual {p3, v1, p1, p5, p6}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public てぜきぽく(Landroid/view/View;IIIII)V
    .registers 15

    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〳ぜぞぜべっ:[I

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺふねづ〺(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public final でどあくず(I)V
    .registers 26

    move-object/from16 v7, p0

    move/from16 v8, p1

    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v9

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v11

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v12

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v13

    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_1c
    if-ge v14, v10, :cond_2c6

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/view/View;

    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    if-nez v8, :cond_3e

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3e

    move v1, v10

    move-object v2, v13

    move/from16 v19, v14

    goto/16 :goto_2c0

    :cond_3e
    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_40
    if-ge v5, v14, :cond_f7

    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v1, v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->てぜきぽく:Landroid/view/View;

    if-ne v1, v0, :cond_e3

    .line 1
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget-object v0, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    if-eqz v0, :cond_e3

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v3

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v2

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v0, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    invoke-virtual {v7, v0, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉざぅち〻(Landroid/view/View;Landroid/graphics/Rect;)V

    const/4 v0, 0x0

    invoke-virtual {v7, v15, v0, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ(Landroid/view/View;ZLandroid/graphics/Rect;)V

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    move/from16 v16, v10

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    move/from16 v17, v0

    move-object/from16 v0, p0

    move-object/from16 v18, v1

    move v1, v9

    move/from16 v19, v14

    move-object v14, v2

    move-object v2, v3

    move-object/from16 v20, v3

    move-object/from16 v3, v18

    move-object/from16 v21, v4

    move/from16 v22, v5

    move/from16 v5, v17

    move-object/from16 v23, v13

    move-object v13, v6

    move v6, v10

    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;II)V

    move-object/from16 v0, v18

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v14, Landroid/graphics/Rect;->left:I

    if-ne v1, v2, :cond_a5

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, v14, Landroid/graphics/Rect;->top:I

    if-eq v1, v2, :cond_a3

    goto :goto_a5

    :cond_a3
    const/4 v1, 0x0

    goto :goto_a6

    :cond_a5
    :goto_a5
    const/4 v1, 0x1

    :goto_a6
    move/from16 v3, v17

    move-object/from16 v2, v21

    invoke-virtual {v7, v2, v0, v3, v10}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺぁあねじ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;Landroid/graphics/Rect;II)V

    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v4, v14, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v5, v14, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v5

    if-eqz v3, :cond_bc

    invoke-static {v15, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇ〳〲〺すっ(Landroid/view/View;I)V

    :cond_bc
    if-eqz v4, :cond_c1

    invoke-static {v15, v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    :cond_c1
    if-eqz v1, :cond_cc

    .line 2
    iget-object v1, v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v1, :cond_cc

    .line 3
    iget-object v2, v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    invoke-virtual {v1, v7, v15, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぁごぐすすぃ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    .line 4
    :cond_cc
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Rect;->setEmpty()V

    sget-object v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    move-object/from16 v2, v20

    invoke-virtual {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {v1, v14}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    goto :goto_ec

    :cond_e3
    move/from16 v22, v5

    move/from16 v16, v10

    move-object/from16 v23, v13

    move/from16 v19, v14

    move-object v13, v6

    :goto_ec
    add-int/lit8 v5, v22, 0x1

    move-object v6, v13

    move/from16 v10, v16

    move/from16 v14, v19

    move-object/from16 v13, v23

    goto/16 :goto_40

    :cond_f7
    move/from16 v16, v10

    move-object/from16 v23, v13

    move/from16 v19, v14

    move-object v13, v6

    const/4 v0, 0x1

    .line 5
    invoke-virtual {v7, v15, v0, v12}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->へぬ〴づぞ(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget v0, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    const/16 v1, 0x30

    const/16 v2, 0x50

    const/4 v3, 0x3

    const/4 v4, 0x5

    if-eqz v0, :cond_15a

    invoke-virtual {v12}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15a

    iget v0, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    invoke-static {v0, v9}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v0

    and-int/lit8 v5, v0, 0x70

    if-eq v5, v1, :cond_12f

    if-eq v5, v2, :cond_11f

    goto :goto_139

    :cond_11f
    iget v5, v11, Landroid/graphics/Rect;->bottom:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    iget v10, v12, Landroid/graphics/Rect;->top:I

    sub-int/2addr v6, v10

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v11, Landroid/graphics/Rect;->bottom:I

    goto :goto_139

    :cond_12f
    iget v5, v11, Landroid/graphics/Rect;->top:I

    iget v6, v12, Landroid/graphics/Rect;->bottom:I

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v11, Landroid/graphics/Rect;->top:I

    :goto_139
    and-int/lit8 v0, v0, 0x7

    if-eq v0, v3, :cond_150

    if-eq v0, v4, :cond_140

    goto :goto_15a

    :cond_140
    iget v0, v11, Landroid/graphics/Rect;->right:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    iget v4, v12, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v11, Landroid/graphics/Rect;->right:I

    goto :goto_15a

    :cond_150
    iget v0, v11, Landroid/graphics/Rect;->left:I

    iget v3, v12, Landroid/graphics/Rect;->right:I

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v11, Landroid/graphics/Rect;->left:I

    :cond_15a
    :goto_15a
    iget v0, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    if-eqz v0, :cond_25e

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_25e

    .line 6
    invoke-static {v15}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_16c

    goto/16 :goto_25e

    :cond_16c
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_25e

    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    move-result v0

    if-gtz v0, :cond_17a

    goto/16 :goto_25e

    :cond_17a
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 7
    iget-object v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 8
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v4

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v15}, Landroid/view/View;->getLeft()I

    move-result v6

    invoke-virtual {v15}, Landroid/view/View;->getTop()I

    move-result v10

    invoke-virtual {v15}, Landroid/view/View;->getRight()I

    move-result v13

    invoke-virtual {v15}, Landroid/view/View;->getBottom()I

    move-result v14

    invoke-virtual {v5, v6, v10, v13, v14}, Landroid/graphics/Rect;->set(IIII)V

    if-eqz v3, :cond_1cf

    invoke-virtual {v3, v7, v15, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->げつ〴ぬぐ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z

    move-result v3

    if-eqz v3, :cond_1cf

    invoke-virtual {v5, v4}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v3

    if-eqz v3, :cond_1ac

    goto :goto_1d2

    :cond_1ac
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Rect should be within the child\'s bounds. Rect:"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | Bounds:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1cf
    invoke-virtual {v4, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 9
    :goto_1d2
    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    sget-object v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v3, v5}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {v4}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1e2

    goto/16 :goto_258

    :cond_1e2
    iget v5, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    invoke-static {v5, v9}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v5

    and-int/lit8 v6, v5, 0x30

    if-ne v6, v1, :cond_1fe

    iget v1, v4, Landroid/graphics/Rect;->top:I

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, v6

    iget v6, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->いいにぽつ:I

    sub-int/2addr v1, v6

    iget v6, v11, Landroid/graphics/Rect;->top:I

    if-ge v1, v6, :cond_1fe

    sub-int/2addr v6, v1

    invoke-virtual {v7, v15, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->どぇぞほだ(Landroid/view/View;I)V

    const/4 v1, 0x1

    goto :goto_1ff

    :cond_1fe
    const/4 v1, 0x0

    :goto_1ff
    and-int/lit8 v6, v5, 0x50

    if-ne v6, v2, :cond_219

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v2, v6

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v2, v6

    iget v6, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->いいにぽつ:I

    add-int/2addr v2, v6

    iget v6, v11, Landroid/graphics/Rect;->bottom:I

    if-ge v2, v6, :cond_219

    sub-int/2addr v2, v6

    invoke-virtual {v7, v15, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->どぇぞほだ(Landroid/view/View;I)V

    const/4 v1, 0x1

    :cond_219
    if-nez v1, :cond_21f

    const/4 v1, 0x0

    invoke-virtual {v7, v15, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->どぇぞほだ(Landroid/view/View;I)V

    :cond_21f
    and-int/lit8 v1, v5, 0x3

    const/4 v2, 0x3

    if-ne v1, v2, :cond_236

    iget v1, v4, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, v2

    iget v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺぁあねじ:I

    sub-int/2addr v1, v2

    iget v2, v11, Landroid/graphics/Rect;->left:I

    if-ge v1, v2, :cond_236

    sub-int/2addr v2, v1

    invoke-virtual {v7, v15, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぶひせが(Landroid/view/View;I)V

    const/4 v1, 0x1

    goto :goto_237

    :cond_236
    const/4 v1, 0x0

    :goto_237
    and-int/lit8 v2, v5, 0x5

    const/4 v5, 0x5

    if-ne v2, v5, :cond_252

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    iget v5, v4, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v2, v5

    iget v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺぁあねじ:I

    add-int/2addr v2, v0

    iget v0, v11, Landroid/graphics/Rect;->right:I

    if-ge v2, v0, :cond_252

    sub-int/2addr v2, v0

    invoke-virtual {v7, v15, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぶひせが(Landroid/view/View;I)V

    const/4 v1, 0x1

    :cond_252
    if-nez v1, :cond_258

    const/4 v0, 0x0

    invoke-virtual {v7, v15, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->なぶひせが(Landroid/view/View;I)V

    .line 11
    :cond_258
    :goto_258
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {v3, v4}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    :cond_25e
    :goto_25e
    const/4 v0, 0x2

    if-eq v8, v0, :cond_283

    .line 12
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 13
    iget-object v1, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    move-object/from16 v2, v23

    .line 14
    invoke-virtual {v2, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 15
    invoke-virtual {v2, v12}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_277

    move/from16 v1, v16

    goto :goto_2c0

    .line 16
    :cond_277
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 17
    iget-object v1, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    invoke-virtual {v1, v12}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_285

    :cond_283
    move-object/from16 v2, v23

    :goto_285
    add-int/lit8 v14, v19, 0x1

    move/from16 v1, v16

    :goto_289
    if-ge v14, v1, :cond_2c0

    .line 18
    iget-object v3, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〺つふすそ:Ljava/util/List;

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 19
    iget-object v5, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v5, :cond_2bd

    .line 20
    invoke-virtual {v5, v7, v3, v15}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びぐびあび(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_2bd

    if-nez v8, :cond_2ad

    .line 21
    iget-boolean v6, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぇぬぎばつ:Z

    if-eqz v6, :cond_2ad

    const/4 v3, 0x0

    .line 22
    iput-boolean v3, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぇぬぎばつ:Z

    goto :goto_2bd

    :cond_2ad
    if-eq v8, v0, :cond_2b4

    .line 23
    invoke-virtual {v5, v7, v3, v15}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ぁごぐすすぃ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result v3

    goto :goto_2b8

    :cond_2b4
    invoke-virtual {v5, v7, v3, v15}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->〳ぜぞぜべっ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V

    const/4 v3, 0x1

    :goto_2b8
    const/4 v5, 0x1

    if-ne v8, v5, :cond_2bd

    .line 24
    iput-boolean v3, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぇぬぎばつ:Z

    :cond_2bd
    :goto_2bd
    add-int/lit8 v14, v14, 0x1

    goto :goto_289

    :cond_2c0
    :goto_2c0
    add-int/lit8 v14, v19, 0x1

    move v10, v1

    move-object v13, v2

    goto/16 :goto_1c

    :cond_2c6
    move-object v2, v13

    .line 25
    invoke-virtual {v11}, Landroid/graphics/Rect;->setEmpty()V

    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v0, v11}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {v0, v12}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {v0, v2}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    return-void
.end method

.method public final どぇぞほだ(Landroid/view/View;I)V
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->いいにぽつ:I

    if-eq v1, p2, :cond_11

    sub-int v1, p2, v1

    invoke-static {p1, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    iput p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->いいにぽつ:I

    :cond_11
    return-void
.end method

.method public なぎぱいぢぎ(Landroid/view/View;Landroid/view/View;II)V
    .registers 6

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    const/4 v0, 0x1

    if-ne p4, v0, :cond_8

    .line 1
    iput p3, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->〺つふすそ:I

    goto :goto_a

    :cond_8
    iput p3, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:I

    .line 2
    :goto_a
    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->のぷのちつ:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p2, 0x0

    :goto_11
    if-ge p2, p1, :cond_30

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-virtual {p3, p4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ(I)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_2d

    .line 3
    :cond_24
    iget-object p3, p3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz p3, :cond_2d

    if-nez p4, :cond_2d

    .line 4
    invoke-virtual {p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->は〲ぱなで()V

    :cond_2d
    :goto_2d
    add-int/lit8 p2, p2, 0x1

    goto :goto_11

    :cond_30
    return-void
.end method

.method public final なぶひせが(Landroid/view/View;I)V
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺぁあねじ:I

    if-eq v1, p2, :cond_11

    sub-int v1, p2, v1

    invoke-static {p1, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇ〳〲〺すっ(Landroid/view/View;I)V

    iput p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺぁあねじ:I

    :cond_11
    return-void
.end method

.method public のぷのちつ(Landroid/view/View;Landroid/view/View;II)Z
    .registers 19

    move/from16 v7, p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_9
    move-object v12, p0

    if-ge v10, v8, :cond_3b

    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_19

    goto :goto_38

    :cond_19
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object v0, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v0, :cond_35

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    .line 2
    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->〻ぞまぎな〻(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z

    move-result v0

    or-int/2addr v11, v0

    invoke-virtual {v13, v7, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ(IZ)V

    goto :goto_38

    :cond_35
    invoke-virtual {v13, v7, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ(IZ)V

    :goto_38
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_3b
    return v11
.end method

.method public final は〲ぱなで(I)I
    .registers 5

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺふねづ〺:[I

    const/4 v1, 0x0

    if-nez v0, :cond_1e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No keylines defined for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " - attempted index lookup "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_1a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    return v1

    :cond_1e
    if-ltz p1, :cond_27

    array-length v2, v0

    if-lt p1, v2, :cond_24

    goto :goto_27

    :cond_24
    aget p1, v0, p1

    return p1

    :cond_27
    :goto_27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Keyline index "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " out of range for "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1a
.end method

.method public final びえぁぜい(Z)V
    .registers 15

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_32

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object v4, v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v4, :cond_2f

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v5, v7

    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v5

    if-eqz p1, :cond_29

    invoke-virtual {v4, p0, v3, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->いいにぽつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_2c

    :cond_29
    invoke-virtual {v4, p0, v3, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    :goto_2c
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    :cond_2f
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_32
    const/4 p1, 0x0

    :goto_33
    if-ge p1, v0, :cond_44

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 3
    iput-boolean v1, v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->のぷのちつ:Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_33

    :cond_44
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->てぜきぽく:Landroid/view/View;

    iput-boolean v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺぁあねじ:Z

    return-void
.end method

.method public ぶでにく〼〳(Landroid/view/View;I)V
    .registers 15

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 1
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぺふねづ〺:Landroid/view/View;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_13

    iget v4, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_13

    const/4 v4, 0x1

    goto :goto_14

    :cond_13
    const/4 v4, 0x0

    :goto_14
    if-nez v4, :cond_1a2

    if-eqz v1, :cond_69

    .line 2
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v2

    :try_start_20
    invoke-virtual {p0, v1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉざぅち〻(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    move-object v5, p0

    move v6, p2

    move-object v7, v0

    move-object v8, v2

    move-object v9, v1

    move v10, v3

    move v11, v4

    invoke-virtual/range {v5 .. v11}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざとぅぼこ〺(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;II)V

    invoke-virtual {p0, v1, v2, v3, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぺぁあねじ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;Landroid/graphics/Rect;II)V

    .line 4
    iget p2, v2, Landroid/graphics/Rect;->left:I

    iget v1, v2, Landroid/graphics/Rect;->top:I

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, v1, v3, v4}, Landroid/view/View;->layout(IIII)V
    :try_end_49
    .catchall {:try_start_20 .. :try_end_49} :catchall_59

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    sget-object p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {p1, v2}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    goto/16 :goto_1a1

    :catchall_59
    move-exception p1

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    sget-object p2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {p2, v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {p2, v2}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    .line 6
    throw p1

    .line 7
    :cond_69
    iget v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    if-ltz v0, :cond_ec

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget v4, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    if-nez v4, :cond_7a

    const v4, 0x800035

    :cond_7a
    invoke-static {v4, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v4

    and-int/lit8 v5, v4, 0x7

    and-int/lit8 v4, v4, 0x70

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    if-ne p2, v2, :cond_96

    sub-int v0, v6, v0

    :cond_96
    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->は〲ぱなで(I)I

    move-result p2

    sub-int/2addr p2, v8

    if-eq v5, v2, :cond_a3

    const/4 v0, 0x5

    if-eq v5, v0, :cond_a1

    goto :goto_a6

    :cond_a1
    add-int/2addr p2, v8

    goto :goto_a6

    :cond_a3
    div-int/lit8 v0, v8, 0x2

    add-int/2addr p2, v0

    :goto_a6
    const/16 v0, 0x10

    if-eq v4, v0, :cond_b2

    const/16 v0, 0x50

    if-eq v4, v0, :cond_af

    goto :goto_b5

    :cond_af
    add-int/lit8 v3, v9, 0x0

    goto :goto_b5

    :cond_b2
    div-int/lit8 v0, v9, 0x2

    add-int/2addr v3, v0

    :goto_b5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    sub-int/2addr v6, v2

    sub-int/2addr v6, v8

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v6, v2

    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v7, v2

    sub-int/2addr v7, v9

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v7, v1

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v8, p2

    add-int/2addr v9, v0

    invoke-virtual {p1, p2, v0, v8, v9}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_1a1

    .line 9
    :cond_ec
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v4, v5

    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    if-eqz v1, :cond_15b

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_15b

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_15b

    iget v1, v7, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v7, Landroid/graphics/Rect;->left:I

    iget v1, v7, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v7, Landroid/graphics/Rect;->top:I

    iget v1, v7, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->right:I

    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->bottom:I

    :cond_15b
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->づざかべべ()Landroid/graphics/Rect;

    move-result-object v8

    iget v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    and-int/lit8 v1, v0, 0x7

    if-nez v1, :cond_169

    const v1, 0x800003

    or-int/2addr v0, v1

    :cond_169
    and-int/lit8 v1, v0, 0x70

    if-nez v1, :cond_16f

    or-int/lit8 v0, v0, 0x30

    :cond_16f
    move v1, v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    if-lt v0, v4, :cond_185

    move-object v4, v7

    move-object v5, v8

    move v6, p2

    invoke-static/range {v1 .. v6}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    goto :goto_188

    :cond_185
    invoke-static {v1, v2, v3, v7, v8}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 11
    :goto_188
    iget p2, v8, Landroid/graphics/Rect;->left:I

    iget v0, v8, Landroid/graphics/Rect;->top:I

    iget v1, v8, Landroid/graphics/Rect;->right:I

    iget v2, v8, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 12
    invoke-virtual {v7}, Landroid/graphics/Rect;->setEmpty()V

    sget-object p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇ〳〲〺すっ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {p1, v7}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {p1, v8}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    :goto_1a1
    return-void

    .line 13
    :cond_1a2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public へぬ〴づぞ(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_29

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_f

    goto :goto_29

    :cond_f
    if-eqz p2, :cond_15

    invoke-virtual {p0, p1, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉざぅち〻(Landroid/view/View;Landroid/graphics/Rect;)V

    goto :goto_28

    :cond_15
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-virtual {p3, p2, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_28
    return-void

    :cond_29
    :goto_29
    invoke-virtual {p3}, Landroid/graphics/Rect;->setEmpty()V

    return-void
.end method

.method public final ぺぁあねじ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;Landroid/graphics/Rect;II)V
    .registers 10

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v3

    iget v3, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    sub-int/2addr v0, v4

    sub-int/2addr v0, p3

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v0, v4

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v1, v4

    sub-int/2addr v1, p4

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v1, p1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p3, v0

    add-int/2addr p4, p1

    invoke-virtual {p2, v0, p1, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;IIIII[I)V
    .registers 25

    move-object/from16 v10, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    const/4 v12, 0x0

    const/4 v0, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_b
    const/4 v9, 0x1

    if-ge v13, v11, :cond_76

    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_1b

    goto :goto_73

    :cond_1b
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    move/from16 v8, p6

    invoke-virtual {v1, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ(I)Z

    move-result v3

    if-nez v3, :cond_2a

    goto :goto_73

    .line 1
    :cond_2a
    iget-object v1, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v1, :cond_73

    .line 2
    iget-object v7, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    aput v12, v7, v12

    aput v12, v7, v9

    move-object v0, v1

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v16, v7

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, v16

    invoke-virtual/range {v0 .. v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->ざとぅぼこ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V

    iget-object v0, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    if-lez p4, :cond_55

    aget v0, v0, v12

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_5b

    :cond_55
    aget v0, v0, v12

    invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_5b
    move v14, v0

    if-lez p5, :cond_68

    iget-object v0, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_71

    :cond_68
    const/4 v1, 0x1

    iget-object v0, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぁごぐすすぃ:[I

    aget v0, v0, v1

    invoke-static {v15, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_71
    move v15, v0

    const/4 v0, 0x1

    :cond_73
    :goto_73
    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_76
    const/4 v1, 0x1

    aget v2, p7, v12

    add-int/2addr v2, v14

    aput v2, p7, v12

    aget v2, p7, v1

    add-int/2addr v2, v15

    aput v2, p7, v1

    if-eqz v0, :cond_86

    invoke-virtual {v10, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->でどあくず(I)V

    :cond_86
    return-void
.end method
