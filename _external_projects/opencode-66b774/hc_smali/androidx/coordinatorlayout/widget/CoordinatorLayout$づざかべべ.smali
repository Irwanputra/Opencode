.class public Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:Z

.field public ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public ぇぬぎばつ:Z

.field public final ぉざぅち〻:Landroid/graphics/Rect;

.field public おぐぴう〸ず:Z

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

.field public づざかべべ:I

.field public てぜきぽく:Landroid/view/View;

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Z

.field public びぐびあび:I

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:I

.field public ぺふねづ〺:Landroid/view/View;


# direct methods
.method public constructor <init>(II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    const/4 p2, -0x1

    iput p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    iput p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    const/4 v1, -0x1

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    sget-object v2, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    sget v3, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_android_layout_gravity:I

    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    sget v3, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_layout_anchor:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    sget v3, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_layout_anchorGravity:I

    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    sget v3, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_layout_keyline:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    sget v1, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_layout_insetEdge:I

    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    sget v1, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_layout_dodgeInsetEdges:I

    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    sget v1, Lづざかべべ/ぁごぐすすぃ/くし〴〺ぅ;->CoordinatorLayout_Layout_layout_behavior:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    iput-boolean v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    if-eqz v3, :cond_f4

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    sget-object v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->でどあくず:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_69

    const/4 p1, 0x0

    goto/16 :goto_e4

    :cond_69
    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_85

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_a8

    :cond_85
    const/16 v3, 0x2e

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_8e

    goto :goto_a8

    :cond_8e
    sget-object v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->でどあくず:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a8

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_a8
    :goto_a8
    :try_start_a8
    sget-object v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->〻ぞまぎな〻:Ljava/lang/ThreadLocal;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_ba

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_ba
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Constructor;

    const/4 v5, 0x1

    if-nez v3, :cond_d7

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v1, v0, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    sget-object v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぶでにく〼〳:[Ljava/lang/Class;

    invoke-virtual {v3, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-interface {v4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d7
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v0

    aput-object p2, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    :try_end_e4
    .catch Ljava/lang/Exception; {:try_start_a8 .. :try_end_e4} :catch_e7

    .line 2
    :goto_e4
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    goto :goto_f4

    :catch_e7
    move-exception p1

    .line 3
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Could not inflate Behavior subclass "

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 4
    :cond_f4
    :goto_f4
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz p1, :cond_fe

    invoke-virtual {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->なぎぱいぢぎ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V

    :cond_fe
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    const/4 v0, -0x1

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    const/4 v0, -0x1

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〺つふすそ:Z

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->くし〴〺ぅ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->びぐびあび:I

    const/4 v0, -0x1

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->づざかべべ:I

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->なぎぱいぢぎ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぁごぐすすぃ:I

    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->ぉざぅち〻:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(IZ)V
    .registers 4

    if-eqz p1, :cond_9

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    goto :goto_b

    :cond_6
    iput-boolean p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->おぐぴう〸ず:Z

    goto :goto_b

    :cond_9
    iput-boolean p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->へぬ〴づぞ:Z

    :goto_b
    return-void
.end method

.method public げつ〴ぬぐ(I)Z
    .registers 3

    if-eqz p1, :cond_a

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 p1, 0x0

    return p1

    :cond_7
    iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->おぐぴう〸ず:Z

    return p1

    :cond_a
    iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->へぬ〴づぞ:Z

    return p1
.end method
