.class public Lcom/google/android/material/bottomappbar/BottomAppBar;
.super Landroidx/appcompat/widget/Toolbar;
.source ""

# interfaces
.implements Landroidx/coordinatorlayout/widget/CoordinatorLayout$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;,
        Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;
    }
.end annotation


# static fields
.field public static final きぬどぼみ〸:I


# instance fields
.field public 〱かけばぜぐ:I

.field public final 〱こか〺ぃせ:Z

.field public 〴ねぷぐくぼ:I

.field public えがぐせほち:Landroid/animation/Animator;

.field public かづげぃぁ〺:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

.field public ぎきぁ〱ぢ:Landroid/animation/AnimatorListenerAdapter;

.field public くぎぶ〼のそ:I

.field public final くねねぱす〻:Z

.field public こ〲しでおか:I

.field public ごまけがぢは:I

.field public ずまげせび〳:Z

.field public final ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

.field public final ておぞぞはね:I

.field public な〱ちぉじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306e\u3077\u306e\u3061\u3064/\u3044\u3044\u306b\u307d\u3064<",
            "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;",
            ">;"
        }
    .end annotation
.end field

.field public final のね〱ばぁぢ:Z

.field public はつきどっ:I

.field public ばおぢでぎか:Landroid/animation/Animator;

.field public ぺがぅす〹ち:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_BottomAppBar:I

    sput v0, Lcom/google/android/material/bottomappbar/BottomAppBar;->きぬどぼみ〸:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->bottomAppBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 14

    sget v6, Lcom/google/android/material/bottomappbar/BottomAppBar;->きぬどぼみ〸:I

    invoke-static {p1, p2, p3, v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-direct {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    const/4 v7, 0x0

    iput v7, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->くぎぶ〼のそ:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ずまげせび〳:Z

    new-instance v0, Lcom/google/android/material/bottomappbar/BottomAppBar$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lcom/google/android/material/bottomappbar/BottomAppBar$げつ〴ぬぐ;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;)V

    iput-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぎきぁ〱ぢ:Landroid/animation/AnimatorListenerAdapter;

    new-instance v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;

    invoke-direct {v0, p0}, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;)V

    iput-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->な〱ちぉじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v8

    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar:[I

    new-array v5, v7, [I

    move-object v0, v8

    move-object v1, p2

    move v3, p3

    move v4, v6

    invoke-static/range {v0 .. v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_backgroundTint:I

    invoke-static {v8, v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_elevation:I

    invoke-virtual {v0, v2, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_fabCradleMargin:I

    invoke-virtual {v0, v3, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    int-to-float v3, v3

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_fabCradleRoundedCornerRadius:I

    invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    int-to-float v4, v4

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_fabCradleVerticalOffset:I

    invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v5

    int-to-float v5, v5

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_fabAlignmentMode:I

    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    iput v9, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_fabAnimationMode:I

    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    iput v9, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->こ〲しでおか:I

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_hideOnScroll:I

    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぺがぅす〹ち:Z

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_paddingBottomSystemWindowInsets:I

    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->のね〱ばぁぢ:Z

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_paddingLeftSystemWindowInsets:I

    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->くねねぱす〻:Z

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomAppBar_paddingRightSystemWindowInsets:I

    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱こか〺ぃせ:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_bottomappbar_fabOffsetEndMode:I

    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ておぞぞはね:I

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    invoke-direct {v0, v3, v4, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;-><init>(FFF)V

    .line 1
    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;

    invoke-direct {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;-><init>()V

    .line 2
    iput-object v0, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/なぎぱいぢぎ;

    .line 3
    invoke-virtual {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object v0

    .line 4
    iget-object v3, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iput-object v0, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    const/4 v0, 0x2

    .line 5
    invoke-virtual {p1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぉ〲なぱぽた(I)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->でどあくず(Landroid/graphics/Paint$Style;)V

    .line 6
    iget-object v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-direct {v3, v8}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    int-to-float v0, v2

    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->setElevation(F)V

    invoke-static {p1, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 8
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_d3

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_d6

    :cond_d3
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    :goto_d6
    new-instance p1, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;

    invoke-direct {p1, p0}, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;)V

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Insets:[I

    invoke-virtual {v0, p2, v1, p3, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Insets_paddingBottomSystemWindowInsets:I

    invoke-virtual {p2, p3, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Insets_paddingLeftSystemWindowInsets:I

    invoke-virtual {p2, v0, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Insets_paddingRightSystemWindowInsets:I

    invoke-virtual {p2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;

    invoke-direct {p2, p3, v0, v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;-><init>(ZZZLなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;)V

    invoke-static {p0, p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->おぐぴう〸ず(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;)V

    return-void
.end method

.method private getActionMenuView()Landroidx/appcompat/widget/ActionMenuView;
    .registers 4

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_15

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v2, v1, Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v2, :cond_12

    check-cast v1, Landroidx/appcompat/widget/ActionMenuView;

    return-object v1

    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_15
    const/4 v0, 0x0

    return-object v0
.end method

.method private getBottomInset()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->〴ねぷぐくぼ:I

    return v0
.end method

.method private getFabTranslationX()F
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぺづげぺが(I)F

    move-result v0

    return v0
.end method

.method private getFabTranslationY()F
    .registers 2

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:F

    neg-float v0, v0

    return v0
.end method

.method private getLeftInset()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱かけばぜぐ:I

    return v0
.end method

.method private getRightInset()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->はつきどっ:I

    return v0
.end method

.method private getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    .line 2
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/なぎぱいぢぎ;

    .line 3
    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    return-object v0
.end method

.method public static synthetic 〻ぞまぎな〻(Lcom/google/android/material/bottomappbar/BottomAppBar;)I
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getBottomInset()I

    move-result p0

    return p0
.end method

.method public static synthetic ぇ〳〲〺すっ(Lcom/google/android/material/bottomappbar/BottomAppBar;)I
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getRightInset()I

    move-result p0

    return p0
.end method

.method public static synthetic ぉ〲なぱぽた(Lcom/google/android/material/bottomappbar/BottomAppBar;)I
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getLeftInset()I

    move-result p0

    return p0
.end method

.method public static でどあくず(Lcom/google/android/material/bottomappbar/BottomAppBar;)V
    .registers 2

    .line 1
    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->くぎぶ〼のそ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->くぎぶ〼のそ:I

    return-void
.end method

.method public static synthetic びえぁぜい(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ぶでにく〼〳(Lcom/google/android/material/bottomappbar/BottomAppBar;)F
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getFabTranslationX()F

    move-result p0

    return p0
.end method


# virtual methods
.method public getBackgroundTint()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public bridge synthetic getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getBehavior()Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    move-result-object v0

    return-object v0
.end method

.method public getBehavior()Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->かづげぃぁ〺:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    if-nez v0, :cond_b

    new-instance v0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    invoke-direct {v0}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->かづげぃぁ〺:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    :cond_b
    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->かづげぃぁ〺:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    return-object v0
.end method

.method public getCradleVerticalOffset()F
    .registers 2

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:F

    return v0
.end method

.method public getFabAlignmentMode()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    return v0
.end method

.method public getFabAnimationMode()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->こ〲しでおか:I

    return v0
.end method

.method public getFabCradleMargin()F
    .registers 2

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ:F

    return v0
.end method

.method public getFabCradleRoundedCornerRadius()F
    .registers 2

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ:F

    return v0
.end method

.method public getHideOnScroll()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぺがぅす〹ち:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .registers 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-static {p0, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅばづそほせ(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    :cond_1a
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/Toolbar;->onLayout(ZIIII)V

    if-eqz p1, :cond_16

    .line 1
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ばおぢでぎか:Landroid/animation/Animator;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_c
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->えがぐせほち:Landroid/animation/Animator;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    .line 2
    :cond_13
    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->けときぜと()V

    :cond_16
    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぷぞてのほき()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroidx/appcompat/widget/Toolbar;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->びぐびあび:I

    iput v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    iget-boolean p1, p1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->づざかべべ:Z

    iput-boolean p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ずまげせび〳:Z

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroidx/appcompat/widget/Toolbar;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    iput v0, v1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->びぐびあび:I

    iget-boolean v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ずまげせび〳:Z

    iput-boolean v0, v1, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->づざかべべ:Z

    return-object v1
.end method

.method public setBackgroundTint(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCradleVerticalOffset(F)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getCradleVerticalOffset()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_17

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ(F)V

    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->けときぜと()V

    :cond_17
    return-void
.end method

.method public setElevation(F)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->おぐぴう〸ず:F

    cmpl-float v2, v2, p1

    if-eqz v2, :cond_f

    iput p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->おぐぴう〸ず:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    .line 2
    :cond_f
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 3
    iget-object v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->ざとぅぼこ〺:I

    .line 4
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->てぜきぽく()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getBehavior()Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    move-result-object p1

    .line 5
    iput v0, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->くし〴〺ぅ:I

    iget v1, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->〺つふすそ:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2c

    iget p1, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->げつ〴ぬぐ:I

    add-int/2addr p1, v0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_2c
    return-void
.end method

.method public setFabAlignmentMode(I)V
    .registers 7

    .line 1
    iget v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    if-eq v0, p1, :cond_52

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_52

    :cond_b
    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->えがぐせほち:Landroid/animation/Animator;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->こ〲しでおか:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_38

    .line 2
    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->どぇぞほだ()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v1

    new-array v2, v2, [F

    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぺづげぺが(I)F

    move-result v3

    const/4 v4, 0x0

    aput v3, v2, v4

    const-string v3, "translationX"

    invoke-static {v1, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    .line 3
    :cond_38
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->なぶひせが(I)V

    :goto_3b
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    iput-object v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->えがぐせほち:Landroid/animation/Animator;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;)V

    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->えがぐせほち:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 4
    :cond_52
    :goto_52
    iget-boolean v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ずまげせび〳:Z

    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->せづっ〸ちね(IZ)V

    iput p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    return-void
.end method

.method public setFabAnimationMode(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->こ〲しでおか:I

    return-void
.end method

.method public setFabCradleMargin(F)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getFabCradleMargin()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_13

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ:F

    .line 2
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    :cond_13
    return-void
.end method

.method public setFabCradleRoundedCornerRadius(F)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getFabCradleRoundedCornerRadius()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_13

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ:F

    .line 2
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    :cond_13
    return-void
.end method

.method public setHideOnScroll(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぺがぅす〹ち:Z

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .registers 2

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 2

    return-void
.end method

.method public final ぅみぱぎぎ()Landroid/view/View;
    .registers 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return-object v1

    :cond_a
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ(Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    instance-of v3, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    if-nez v3, :cond_2c

    instance-of v3, v2, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    if-eqz v3, :cond_18

    :cond_2c
    return-object v2

    :cond_2d
    return-object v1
.end method

.method public final ぉひのべい()Z
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->どぇぞほだ()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    return v0
.end method

.method public おかぷせ〱(I)Z
    .registers 3

    int-to-float p1, p1

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->びぐびあび:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_18

    .line 2
    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    .line 3
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->びぐびあび:F

    .line 4
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    const/4 p1, 0x1

    return p1

    :cond_18
    const/4 p1, 0x0

    return p1
.end method

.method public final けときぜと()V
    .registers 4

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getTopEdgeTreatment()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getFabTranslationX()F

    move-result v1

    .line 1
    iput v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->なぎぱいぢぎ:F

    .line 2
    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぅみぱぎぎ()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget-boolean v2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ずまげせび〳:Z

    if-eqz v2, :cond_1d

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぉひのべい()Z

    move-result v2

    if-eqz v2, :cond_1d

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_1e

    :cond_1d
    const/4 v2, 0x0

    :goto_1e
    invoke-virtual {v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ざっざへづ(F)V

    if-eqz v0, :cond_31

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getFabTranslationY()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getFabTranslationX()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    :cond_31
    return-void
.end method

.method public じぜこほぱ(Landroidx/appcompat/widget/ActionMenuView;IZ)I
    .registers 10

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_68

    if-nez p3, :cond_7

    goto :goto_68

    :cond_7
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えがぐせほち(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p3

    goto :goto_13

    :cond_12
    const/4 p3, 0x0

    :goto_13
    const/4 v2, 0x0

    :goto_14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_52

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v4, v4, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz v4, :cond_39

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v4, v4, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    const v5, 0x800007

    and-int/2addr v4, v5

    const v5, 0x800003

    if-ne v4, v5, :cond_39

    const/4 v4, 0x1

    goto :goto_3a

    :cond_39
    const/4 v4, 0x0

    :goto_3a
    if-eqz v4, :cond_4f

    if-eqz p2, :cond_47

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result p3

    goto :goto_4f

    :cond_47
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-static {p3, v3}, Ljava/lang/Math;->max(II)I

    move-result p3

    :cond_4f
    :goto_4f
    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_52
    if-eqz p2, :cond_59

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getRight()I

    move-result p1

    goto :goto_5d

    :cond_59
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLeft()I

    move-result p1

    :goto_5d
    if-eqz p2, :cond_62

    iget p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->はつきどっ:I

    goto :goto_65

    :cond_62
    iget p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱かけばぜぐ:I

    neg-int p2, p2

    :goto_65
    add-int/2addr p1, p2

    sub-int/2addr p3, p1

    return p3

    :cond_68
    :goto_68
    return v1
.end method

.method public final せづっ〸ちね(IZ)V
    .registers 12

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ばおぢでぎか:Landroid/animation/Animator;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぉひのべい()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1c

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 1
    :cond_1c
    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getActionMenuView()Landroidx/appcompat/widget/ActionMenuView;

    move-result-object v1

    if-nez v1, :cond_23

    goto :goto_76

    :cond_23
    const/4 v3, 0x1

    new-array v4, v3, [F

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v4, v2

    const-string v6, "alpha"

    invoke-static {v1, v6, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getTranslationX()F

    move-result v7

    invoke-virtual {p0, v1, p1, p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->じぜこほぱ(Landroidx/appcompat/widget/ActionMenuView;IZ)I

    move-result v8

    int-to-float v8, v8

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpl-float v7, v7, v5

    if-lez v7, :cond_6b

    new-array v5, v3, [F

    const/4 v7, 0x0

    aput v7, v5, v2

    invoke-static {v1, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    new-instance v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;

    invoke-direct {v6, p0, v1, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;Landroidx/appcompat/widget/ActionMenuView;IZ)V

    invoke-virtual {v5, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v6, 0x96

    invoke-virtual {p1, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 p2, 0x2

    new-array p2, p2, [Landroid/animation/Animator;

    aput-object v5, p2, v2

    aput-object v4, p2, v3

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_76

    :cond_6b
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getAlpha()F

    move-result p1

    cmpg-float p1, p1, v5

    if-gez p1, :cond_76

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    :cond_76
    :goto_76
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ばおぢでぎか:Landroid/animation/Animator;

    new-instance p2, Lcom/google/android/material/bottomappbar/BottomAppBar$びぐびあび;

    invoke-direct {p2, p0}, Lcom/google/android/material/bottomappbar/BottomAppBar$びぐびあび;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;)V

    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ばおぢでぎか:Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method public final どぇぞほだ()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぅみぱぎぎ()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    if-eqz v1, :cond_b

    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return-object v0
.end method

.method public なぶひせが(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->どぇぞほだ()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->いいにぽつ()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_1b

    .line 1
    :cond_d
    iget v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->くぎぶ〼のそ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->くぎぶ〼のそ:I

    .line 2
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/〺つふすそ;

    invoke-direct {v1, p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/〺つふすそ;-><init>(Lcom/google/android/material/bottomappbar/BottomAppBar;I)V

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->ぺぁあねじ(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$げつ〴ぬぐ;Z)V

    :cond_1b
    :goto_1b
    return-void
.end method

.method public final ぷぞてのほき()V
    .registers 4

    invoke-direct {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getActionMenuView()Landroidx/appcompat/widget/ActionMenuView;

    move-result-object v0

    if-eqz v0, :cond_24

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    invoke-virtual {p0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぉひのべい()Z

    move-result v1

    if-nez v1, :cond_1b

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->じぜこほぱ(Landroidx/appcompat/widget/ActionMenuView;IZ)I

    move-result v1

    :goto_16
    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTranslationX(F)V

    goto :goto_24

    .line 2
    :cond_1b
    iget v1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ごまけがぢは:I

    iget-boolean v2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ずまげせび〳:Z

    .line 3
    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->じぜこほぱ(Landroidx/appcompat/widget/ActionMenuView;IZ)I

    move-result v1

    goto :goto_16

    :cond_24
    :goto_24
    return-void
.end method

.method public final ぺづげぺが(I)F
    .registers 5

    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えがぐせほち(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1f

    if-eqz v0, :cond_c

    iget p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱かけばぜぐ:I

    goto :goto_e

    :cond_c
    iget p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->はつきどっ:I

    :goto_e
    iget v2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ておぞぞはね:I

    add-int/2addr v2, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    sub-int/2addr p1, v2

    if-eqz v0, :cond_1b

    const/4 v1, -0x1

    :cond_1b
    mul-int p1, p1, v1

    int-to-float p1, p1

    return p1

    :cond_1f
    const/4 p1, 0x0

    return p1
.end method
