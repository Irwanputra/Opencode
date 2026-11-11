.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;,
        Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;,
        Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static 〳ぜぞぜべっ:Ljava/lang/reflect/Field;

.field public static 〺つふすそ:Ljava/lang/reflect/Field;

.field public static ぁごぐすすぃ:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3054\u3065\u3054\u304d\u3048;",
            ">;"
        }
    .end annotation
.end field

.field public static いいにぽつ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field public static くし〴〺ぅ:Z

.field public static final げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static づざかべべ:Z

.field public static なぎぱいぢぎ:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static びぐびあび:Ljava/lang/reflect/Field;

.field public static ぺぁあねじ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    sput-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺぁあねじ:Z

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    return-void
.end method

.method public static 〳ぜぞぜべっ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .registers 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getAccessibilityDelegate()Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0

    .line 1
    :cond_b
    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺぁあねじ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    goto :goto_33

    :cond_11
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    if-nez v0, :cond_23

    :try_start_16
    const-class v0, Landroid/view/View;

    const-string v3, "mAccessibilityDelegate"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    :cond_23
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/view/View$AccessibilityDelegate;

    if-eqz v0, :cond_33

    check-cast p0, Landroid/view/View$AccessibilityDelegate;
    :try_end_2f
    .catchall {:try_start_16 .. :try_end_2f} :catchall_31

    move-object v1, p0

    goto :goto_33

    :catchall_31
    sput-boolean v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺぁあねじ:Z

    :cond_33
    :goto_33
    return-object v1
.end method

.method public static 〺つふすそ(Landroid/view/View;I)V
    .registers 3

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_23

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_23

    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->こ〲しでおか(Landroid/view/View;)V

    :cond_23
    return-void
.end method

.method public static 〺でおいここ(Landroid/view/View;I)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_9

    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    :cond_9
    return-void
.end method

.method public static 〻ぞまぎな〻(Landroid/view/View;)Z
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p0

    return p0

    :cond_b
    instance-of v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;

    if-eqz v0, :cond_16

    check-cast p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;

    invoke-interface {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;->isNestedScrollingEnabled()Z

    move-result p0

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public static ぁごぐすすぃ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;
    .registers 2

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〳ぜぞぜべっ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    instance-of v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-eqz v0, :cond_11

    check-cast p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    iget-object p0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    return-object p0

    :cond_11
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    return-object v0
.end method

.method public static ぃぜぶの〸ぃ(Landroid/view/View;Z)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_9

    invoke-virtual {p0, p1}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_9
    return-void
.end method

.method public static いいにぽつ(Landroid/view/View;)Landroid/graphics/Rect;
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object p0

    return-object p0

    :cond_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_11

    :cond_a
    invoke-static {}, Landroid/animation/ValueAnimator;->getFrameDelay()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_11
    return-void
.end method

.method public static ぇ〳〲〺すっ(Landroid/view/View;I)V
    .registers 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_6b

    :cond_a
    const/16 v1, 0x15

    if-lt v0, v1, :cond_68

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->てぜきぽく()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_47

    move-object v1, v2

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {v0, v3, v4, v5, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    :cond_47
    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〺つふすそ(Landroid/view/View;I)V

    if-eqz v1, :cond_6b

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    invoke-virtual {v0, p1, v1, v3, p0}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p0

    if-eqz p0, :cond_6b

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_6b

    :cond_68
    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〺つふすそ(Landroid/view/View;I)V

    :cond_6b
    :goto_6b
    return-void
.end method

.method public static ぇとしたべど(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_d

    :cond_a
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_d
    return-void
.end method

.method public static ぇぬぎばつ(Landroid/view/View;)I
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result p0

    return p0

    :cond_b
    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->づざかべべ:Z

    if-nez v0, :cond_1f

    const/4 v0, 0x1

    :try_start_10
    const-class v1, Landroid/view/View;

    const-string v2, "mMinHeight"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びぐびあび:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldException; {:try_start_10 .. :try_end_1d} :catch_1d

    :catch_1d
    sput-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->づざかべべ:Z

    :cond_1f
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びぐびあび:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2e

    :try_start_23
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_2d} :catch_2e

    return p0

    :catch_2e
    :cond_2e
    const/4 p0, 0x0

    return p0
.end method

.method public static えがぐせほち(Landroid/view/View;IIII)V
    .registers 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_d

    :cond_a
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    :goto_d
    return-void
.end method

.method public static ぉ〲なぱぽた(Landroid/view/View;I)V
    .registers 7

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_13

    return-void

    .line 1
    :cond_13
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉざぅち〻;

    sget v1, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_pane_title:I

    const-class v2, Ljava/lang/CharSequence;

    const/16 v3, 0x8

    const/16 v4, 0x1c

    invoke-direct {v0, v1, v2, v3, v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉざぅち〻;-><init>(ILjava/lang/Class;II)V

    .line 2
    invoke-virtual {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_2b

    const/4 v0, 0x1

    goto :goto_2c

    :cond_2b
    const/4 v0, 0x0

    .line 3
    :goto_2c
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v2, v3, :cond_36

    invoke-virtual {p0}, Landroid/view/View;->getAccessibilityLiveRegion()I

    move-result v1

    :cond_36
    if-nez v1, :cond_5b

    if-eqz v0, :cond_41

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_41

    goto :goto_5b

    :cond_41
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_6f

    :try_start_47
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p0, p0, p1}, Landroid/view/ViewParent;->notifySubtreeAccessibilityStateChanged(Landroid/view/View;Landroid/view/View;I)V
    :try_end_4e
    .catch Ljava/lang/AbstractMethodError; {:try_start_47 .. :try_end_4e} :catch_4f

    goto :goto_6f

    :catch_4f
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    goto :goto_6f

    :cond_5b
    :goto_5b
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    if-eqz v0, :cond_64

    const/16 v0, 0x20

    goto :goto_66

    :cond_64
    const/16 v0, 0x800

    :goto_66
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-virtual {v1, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    invoke-virtual {p0, v1}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_6f
    :goto_6f
    return-void
.end method

.method public static ぉざぅち〻(Landroid/view/View;)I
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    move-result p0

    return p0

    :cond_b
    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->くし〴〺ぅ:Z

    if-nez v0, :cond_1f

    const/4 v0, 0x1

    :try_start_10
    const-class v1, Landroid/view/View;

    const-string v2, "mMinWidth"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〺つふすそ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldException; {:try_start_10 .. :try_end_1d} :catch_1d

    :catch_1d
    sput-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->くし〴〺ぅ:Z

    :cond_1f
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〺つふすそ:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2e

    :try_start_23
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_2d} :catch_2e

    return p0

    :catch_2e
    :cond_2e
    const/4 p0, 0x0

    return p0
.end method

.method public static ぉひのべい(ILandroid/view/View;)V
    .registers 4

    .line 1
    sget v0, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_actions:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_12

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_12
    const/4 p1, 0x0

    .line 2
    :goto_13
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2c

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ()I

    move-result v0

    if-ne v0, p0, :cond_29

    invoke-interface {v1, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2c

    :cond_29
    add-int/lit8 p1, p1, 0x1

    goto :goto_13

    :cond_2c
    :goto_2c
    return-void
.end method

.method public static おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V
    .registers 3

    if-nez p1, :cond_f

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〳ぜぞぜべっ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    instance-of v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-eqz v0, :cond_f

    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-direct {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    :cond_f
    if-nez p1, :cond_13

    const/4 p1, 0x0

    goto :goto_15

    .line 1
    :cond_13
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    :goto_15
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    return-void
.end method

.method public static おぐぴう〸ず(Landroid/view/View;)I
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public static くし〴〺ぅ(Landroid/view/View;I)V
    .registers 3

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_23

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_23

    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->こ〲しでおか(Landroid/view/View;)V

    :cond_23
    return-void
.end method

.method public static けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    .registers 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "ContextFirst"
            }
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_9

    .line 1
    invoke-virtual/range {p0 .. p6}, Landroid/view/View;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_9
    return-void
.end method

.method public static げがぴうあだ(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_9

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    :cond_9
    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;
    .registers 3

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/WeakHashMap;

    if-nez v0, :cond_b

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/WeakHashMap;

    :cond_b
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    if-nez v0, :cond_1f

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-direct {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;-><init>(Landroid/view/View;)V

    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1f
    return-object v0
.end method

.method public static こ〲しでおか(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v1, v0

    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static ごづごきえ(Landroid/view/View;)Ljava/lang/String;
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/WeakHashMap;

    if-nez v0, :cond_11

    const/4 p0, 0x0

    return-object p0

    :cond_11
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static ごまけがぢは(Landroid/view/View;Ljava/lang/String;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    goto :goto_1a

    :cond_a
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/WeakHashMap;

    if-nez v0, :cond_15

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/WeakHashMap;

    :cond_15
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1a
    return-void
.end method

.method public static ざっざへづ(Landroid/view/View;)I
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public static ざとぅぼこ〺(Landroid/view/View;)I
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p0

    return p0

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    return p0
.end method

.method public static じぜこほぱ(Landroid/view/View;Ljava/lang/Runnable;J)V
    .registers 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    goto :goto_12

    :cond_a
    invoke-static {}, Landroid/animation/ValueAnimator;->getFrameDelay()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_12
    return-void
.end method

.method public static せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V
    .registers 10

    if-nez p3, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ()I

    move-result p1

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    goto :goto_4b

    .line 1
    :cond_a
    new-instance p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    iget v2, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    iget-object v5, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;Ljava/lang/Class;)V

    .line 2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x15

    if-lt p1, p3, :cond_4b

    .line 3
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    move-result-object p1

    if-nez p1, :cond_28

    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-direct {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    :cond_28
    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V

    .line 4
    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ()I

    move-result p1

    invoke-static {p1, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぉひのべい(ILandroid/view/View;)V

    .line 5
    sget p1, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_actions:I

    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    if-nez p3, :cond_44

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    :cond_44
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぉ〲なぱぽた(Landroid/view/View;I)V

    :cond_4b
    :goto_4b
    return-void
.end method

.method public static ち〴みぎ〻び(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_15

    if-nez p1, :cond_d

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void

    :cond_d
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$げつ〴ぬぐ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_15
    return-void
.end method

.method public static づざかべべ(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .registers 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_8

    return v1

    .line 1
    :cond_8
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->びぐびあび:Ljava/util/ArrayList;

    sget v0, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_unhandled_key_event_manager:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;

    if-nez v2, :cond_1c

    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;

    invoke-direct {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;-><init>()V

    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2
    :cond_1c
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_7d

    .line 3
    iget-object v0, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->げつ〴ぬぐ:Ljava/util/WeakHashMap;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    :cond_29
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_32

    goto :goto_7d

    :cond_32
    monitor-enter v0

    :try_start_33
    iget-object v3, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->げつ〴ぬぐ:Ljava/util/WeakHashMap;

    if-nez v3, :cond_3e

    new-instance v3, Ljava/util/WeakHashMap;

    invoke-direct {v3}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v3, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->げつ〴ぬぐ:Ljava/util/WeakHashMap;

    :cond_3e
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    :cond_42
    :goto_42
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_78

    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    if-nez v5, :cond_5a

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_42

    :cond_5a
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->げつ〴ぬぐ:Ljava/util/WeakHashMap;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v5, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    :goto_65
    instance-of v5, v4, Landroid/view/View;

    if-eqz v5, :cond_42

    iget-object v5, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->げつ〴ぬぐ:Ljava/util/WeakHashMap;

    move-object v6, v4

    check-cast v6, Landroid/view/View;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v6, v7}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    goto :goto_65

    :cond_78
    monitor-exit v0

    goto :goto_7d

    :catchall_7a
    move-exception p0

    monitor-exit v0
    :try_end_7c
    .catchall {:try_start_33 .. :try_end_7c} :catchall_7a

    throw p0

    .line 4
    :cond_7d
    :goto_7d
    invoke-virtual {v2, p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->げつ〴ぬぐ(Landroid/view/View;Landroid/view/KeyEvent;)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_a8

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    if-eqz p0, :cond_a8

    invoke-static {p1}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_a8

    .line 5
    iget-object v0, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->〺つふすそ:Landroid/util/SparseArray;

    if-nez v0, :cond_9e

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->〺つふすそ:Landroid/util/SparseArray;

    :cond_9e
    iget-object v0, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$びぐびあび;->〺つふすそ:Landroid/util/SparseArray;

    .line 6
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_a8
    if-eqz p0, :cond_ab

    const/4 v1, 0x1

    :cond_ab
    return v1
.end method

.method public static ておぞぞはね(Landroid/view/View;I)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_a

    :cond_6
    :goto_6
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    goto :goto_13

    :cond_a
    const/16 v1, 0x10

    if-lt v0, v1, :cond_13

    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    const/4 p1, 0x2

    goto :goto_6

    :cond_13
    :goto_13
    return-void
.end method

.method public static てぜきぽく()Landroid/graphics/Rect;
    .registers 2

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->いいにぽつ:Ljava/lang/ThreadLocal;

    if-nez v0, :cond_b

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->いいにぽつ:Ljava/lang/ThreadLocal;

    :cond_b
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->いいにぽつ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_1f

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->いいにぽつ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1f
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    return-object v0
.end method

.method public static でどあくず(Landroid/view/View;)Z
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    return p0

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    if-eqz p0, :cond_13

    const/4 p0, 0x1

    goto :goto_14

    :cond_13
    const/4 p0, 0x0

    :goto_14
    return p0
.end method

.method public static どぇぞほだ(Landroid/view/View;)V
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_d

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :goto_d
    return-void
.end method

.method public static ながふずは(Landroid/view/View;F)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    :cond_9
    return-void
.end method

.method public static なぎぱいぢぎ()I
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_b

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    return v0

    :cond_b
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    const v3, 0xffffff

    if-le v2, v3, :cond_19

    const/4 v2, 0x1

    :cond_19
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_b

    return v1
.end method

.method public static なぶひせが(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1b

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->いいにぽつ()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {p0, v0}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    .line 1
    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-direct {p1, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;-><init>(Landroid/view/WindowInsets;)V

    :cond_1b
    return-object p1
.end method

.method public static のぷのちつ(Landroid/view/View;)Z
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public static は〲ぱなで(Landroid/view/View;)I
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p0

    return p0

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p0

    return p0
.end method

.method public static ばおぢでぎか(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/のぷのちつ;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_11

    if-eqz p1, :cond_b

    .line 1
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/のぷのちつ;->げつ〴ぬぐ:Ljava/lang/Object;

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 2
    :goto_c
    check-cast p1, Landroid/view/PointerIcon;

    invoke-virtual {p0, p1}, Landroid/view/View;->setPointerIcon(Landroid/view/PointerIcon;)V

    :cond_11
    return-void
.end method

.method public static びえぁぜい(Landroid/view/View;I)V
    .registers 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    goto :goto_6b

    :cond_a
    const/16 v1, 0x15

    if-lt v0, v1, :cond_68

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->てぜきぽく()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_47

    move-object v1, v2

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {v0, v3, v4, v5, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    :cond_47
    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->くし〴〺ぅ(Landroid/view/View;I)V

    if-eqz v1, :cond_6b

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    invoke-virtual {v0, p1, v1, v3, p0}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p0

    if-eqz p0, :cond_6b

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_6b

    :cond_68
    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->くし〴〺ぅ(Landroid/view/View;I)V

    :cond_6b
    :goto_6b
    return-void
.end method

.method public static びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1c

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->いいにぽつ()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    .line 1
    new-instance p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-direct {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;-><init>(Landroid/view/WindowInsets;)V

    return-object p0

    :cond_1c
    return-object p1
.end method

.method public static ぶでにく〼〳(Landroid/view/View;)Z
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result p0

    return p0

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_19

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    if-lez p0, :cond_19

    const/4 p0, 0x1

    goto :goto_1a

    :cond_19
    const/4 p0, 0x0

    :goto_1a
    return p0
.end method

.method public static ぷぞてのほき(Landroid/view/View;)V
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    goto :goto_11

    :cond_a
    const/16 v1, 0x10

    if-lt v0, v1, :cond_11

    invoke-virtual {p0}, Landroid/view/View;->requestFitSystemWindows()V

    :cond_11
    :goto_11
    return-void
.end method

.method public static へぬ〴づぞ(Landroid/view/View;)I
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public static ぺぁあねじ(Landroid/view/View;)Landroid/content/res/ColorStateList;
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_b
    instance-of v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;

    if-eqz v0, :cond_16

    check-cast p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;

    invoke-interface {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    goto :goto_17

    :cond_16
    const/4 p0, 0x0

    :goto_17
    return-object p0
.end method

.method public static ぺづげぺが(Landroid/view/View;I)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_d

    invoke-static {p1, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぉひのべい(ILandroid/view/View;)V

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぉ〲なぱぽた(Landroid/view/View;I)V

    :cond_d
    return-void
.end method

.method public static ぺふねづ〺(Landroid/view/View;)F
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method
