.class public Landroidx/appcompat/widget/ListPopupWindow;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ListPopupWindow$くし〴〺ぅ;,
        Landroidx/appcompat/widget/ListPopupWindow$びぐびあび;,
        Landroidx/appcompat/widget/ListPopupWindow$づざかべべ;,
        Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;,
        Landroidx/appcompat/widget/ListPopupWindow$〺つふすそ;
    }
.end annotation


# static fields
.field public static ぅみぱぎぎ:Ljava/lang/reflect/Method;

.field public static どぇぞほだ:Ljava/lang/reflect/Method;

.field public static なぶひせが:Ljava/lang/reflect/Method;


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:Landroid/content/Context;

.field public final 〻ぞまぎな〻:Landroid/graphics/Rect;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Z

.field public ぇ〳〲〺すっ:Z

.field public ぇぬぎばつ:Landroid/database/DataSetObserver;

.field public ぉ〲なぱぽた:Landroid/graphics/Rect;

.field public ぉざぅち〻:Landroid/view/View;

.field public おぐぴう〸ず:I

.field public くし〴〺ぅ:Landroid/widget/ListAdapter;

.field public final ごづごきえ:Landroidx/appcompat/widget/ListPopupWindow$びぐびあび;

.field public final ざっざへづ:Landroidx/appcompat/widget/ListPopupWindow$くし〴〺ぅ;

.field public ざとぅぼこ〺:Landroid/widget/AdapterView$OnItemClickListener;

.field public づざかべべ:I

.field public てぜきぽく:Z

.field public final でどあくず:Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;

.field public なぎぱいぢぎ:I

.field public のぷのちつ:I

.field public final は〲ぱなで:Landroidx/appcompat/widget/ListPopupWindow$づざかべべ;

.field public びえぁぜい:Landroid/widget/PopupWindow;

.field public びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

.field public final ぶでにく〼〳:Landroid/os/Handler;

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:I

.field public ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x1c

    if-gt v0, v3, :cond_2a

    :try_start_8
    const-class v0, Landroid/widget/PopupWindow;

    const-string v3, "setClipToScreenEnabled"

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/ListPopupWindow;->なぶひせが:Ljava/lang/reflect/Method;
    :try_end_18
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_18} :catch_18

    :catch_18
    :try_start_18
    const-class v0, Landroid/widget/PopupWindow;

    const-string v3, "setEpicenterBounds"

    new-array v4, v2, [Ljava/lang/Class;

    const-class v5, Landroid/graphics/Rect;

    aput-object v5, v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/ListPopupWindow;->ぅみぱぎぎ:Ljava/lang/reflect/Method;
    :try_end_28
    .catch Ljava/lang/NoSuchMethodException; {:try_start_18 .. :try_end_28} :catch_29

    goto :goto_2a

    :catch_29
    nop

    :cond_2a
    :goto_2a
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-gt v0, v3, :cond_4a

    :try_start_30
    const-class v0, Landroid/widget/PopupWindow;

    const-string v3, "getMaxAvailableHeight"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Class;

    const-class v5, Landroid/view/View;

    aput-object v5, v4, v1

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, v4, v2

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v2, v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/ListPopupWindow;->どぇぞほだ:Ljava/lang/reflect/Method;
    :try_end_4a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_30 .. :try_end_4a} :catch_4a

    :catch_4a
    :cond_4a
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->listPopupWindowStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->づざかべべ:I

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    const/16 v0, 0x3ea

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぺぁあねじ:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->のぷのちつ:I

    const v1, 0x7fffffff

    iput v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->へぬ〴づぞ:I

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->おぐぴう〸ず:I

    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$づざかべべ;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$づざかべべ;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->は〲ぱなで:Landroidx/appcompat/widget/ListPopupWindow$づざかべべ;

    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$びぐびあび;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$びぐびあび;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->ごづごきえ:Landroidx/appcompat/widget/ListPopupWindow$びぐびあび;

    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$くし〴〺ぅ;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->ざっざへづ:Landroidx/appcompat/widget/ListPopupWindow$くし〴〺ぅ;

    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->でどあくず:Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ:Landroid/content/Context;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぶでにく〼〳:Landroid/os/Handler;

    sget-object v1, Lづざかべべ/〺つふすそ/いいにぽつ;->ListPopupWindow:[I

    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->ListPopupWindow_android_dropDownHorizontalOffset:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->ListPopupWindow_android_dropDownVerticalOffset:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    const/4 v2, 0x1

    if-eqz v0, :cond_61

    iput-boolean v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->いいにぽつ:Z

    :cond_61
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Landroidx/appcompat/widget/AppCompatPopupWindow;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぶでにく〼〳:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->は〲ぱなで:Landroidx/appcompat/widget/ListPopupWindow$づざかべべ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public show()V
    .registers 15

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    const/4 v1, 0x1

    if-nez v0, :cond_3f

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ:Landroid/content/Context;

    iget-boolean v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇ〳〲〺すっ:Z

    xor-int/2addr v2, v1

    invoke-virtual {p0, v0, v2}, Landroidx/appcompat/widget/ListPopupWindow;->ぇぬぎばつ(Landroid/content/Context;Z)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setFocusable(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setFocusableInTouchMode(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    new-instance v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/ごづごきえ;

    invoke-direct {v2, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ごづごきえ;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ざっざへづ:Landroidx/appcompat/widget/ListPopupWindow$くし〴〺ぅ;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    goto :goto_47

    :cond_3f
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :goto_47
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_64

    iget-object v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v3

    iget-boolean v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->いいにぽつ:Z

    if-nez v4, :cond_6a

    neg-int v3, v3

    iput v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    goto :goto_6a

    :cond_64
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    const/4 v0, 0x0

    :cond_6a
    :goto_6a
    iget-object v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_75

    const/4 v3, 0x1

    goto :goto_76

    :cond_75
    const/4 v3, 0x0

    .line 2
    :goto_76
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 3
    iget v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    .line 4
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x17

    if-gt v7, v8, :cond_a9

    sget-object v7, Landroidx/appcompat/widget/ListPopupWindow;->どぇぞほだ:Ljava/lang/reflect/Method;

    if-eqz v7, :cond_a2

    :try_start_84
    iget-object v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v5, v9, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v9, v4

    invoke-virtual {v7, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3
    :try_end_a1
    .catch Ljava/lang/Exception; {:try_start_84 .. :try_end_a1} :catch_a2

    goto :goto_af

    :catch_a2
    :cond_a2
    iget-object v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v5, v6}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    move-result v3

    goto :goto_af

    :cond_a9
    iget-object v7, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v7, v5, v6, v3}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I

    move-result v3

    .line 5
    :goto_af
    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->づざかべべ:I

    const/4 v6, -0x2

    const/4 v7, -0x1

    if-ne v5, v7, :cond_b7

    add-int/2addr v3, v0

    goto :goto_10a

    :cond_b7
    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    if-eq v5, v6, :cond_d5

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v5, v7, :cond_c0

    goto :goto_eb

    :cond_c0
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v9, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    iget v10, v9, Landroid/graphics/Rect;->left:I

    iget v9, v9, Landroid/graphics/Rect;->right:I

    add-int/2addr v10, v9

    sub-int/2addr v5, v10

    goto :goto_eb

    :cond_d5
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    iget v9, v8, Landroid/graphics/Rect;->left:I

    iget v8, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v9, v8

    sub-int/2addr v5, v9

    const/high16 v8, -0x80000000

    :goto_eb
    invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    iget-object v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    sub-int/2addr v3, v2

    invoke-virtual {v8, v5, v3, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->げつ〴ぬぐ(III)I

    move-result v3

    if-lez v3, :cond_108

    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {v5}, Landroid/widget/ListView;->getPaddingTop()I

    move-result v5

    iget-object v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {v8}, Landroid/widget/ListView;->getPaddingBottom()I

    move-result v8

    add-int/2addr v8, v5

    add-int/2addr v8, v0

    add-int/2addr v8, v2

    goto :goto_109

    :cond_108
    const/4 v8, 0x0

    :goto_109
    add-int/2addr v3, v8

    .line 6
    :goto_10a
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    if-ne v0, v4, :cond_114

    const/4 v0, 0x1

    goto :goto_115

    :cond_114
    const/4 v0, 0x0

    .line 7
    :goto_115
    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぺぁあねじ:I

    invoke-static {v4, v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぱでかぁ〻〹(Landroid/widget/PopupWindow;I)V

    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_187

    .line 8
    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 9
    invoke-static {v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_12d

    return-void

    :cond_12d
    iget v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    if-ne v4, v7, :cond_133

    const/4 v4, -0x1

    goto :goto_13b

    :cond_133
    if-ne v4, v6, :cond_13b

    .line 10
    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 11
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    :cond_13b
    :goto_13b
    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->づざかべべ:I

    if-ne v5, v7, :cond_167

    if-eqz v0, :cond_142

    goto :goto_143

    :cond_142
    const/4 v3, -0x1

    :goto_143
    if-eqz v0, :cond_157

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    if-ne v5, v7, :cond_14d

    const/4 v5, -0x1

    goto :goto_14e

    :cond_14d
    const/4 v5, 0x0

    :goto_14e
    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_16b

    :cond_157
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    if-ne v5, v7, :cond_15e

    const/4 v2, -0x1

    :cond_15e
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v7}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_16b

    :cond_167
    if-ne v5, v6, :cond_16a

    goto :goto_16b

    :cond_16a
    move v3, v5

    :goto_16b
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    .line 12
    iget-object v9, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 13
    iget v10, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    iget v11, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    if-gez v4, :cond_17c

    const/4 v12, -0x1

    goto :goto_17d

    :cond_17c
    move v12, v4

    :goto_17d
    if-gez v3, :cond_181

    const/4 v13, -0x1

    goto :goto_182

    :cond_181
    move v13, v3

    :goto_182
    invoke-virtual/range {v8 .. v13}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    goto/16 :goto_24e

    :cond_187
    iget v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    if-ne v0, v7, :cond_18d

    const/4 v0, -0x1

    goto :goto_195

    :cond_18d
    if-ne v0, v6, :cond_195

    .line 14
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    :cond_195
    :goto_195
    iget v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->づざかべべ:I

    if-ne v4, v7, :cond_19b

    const/4 v3, -0x1

    goto :goto_19f

    :cond_19b
    if-ne v4, v6, :cond_19e

    goto :goto_19f

    :cond_19e
    move v3, v4

    :goto_19f
    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-gt v0, v3, :cond_1c1

    sget-object v0, Landroidx/appcompat/widget/ListPopupWindow;->なぶひせが:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1c6

    :try_start_1b3
    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    new-array v5, v1, [Ljava/lang/Object;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v6, v5, v2

    invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1be
    .catch Ljava/lang/Exception; {:try_start_1b3 .. :try_end_1be} :catch_1bf

    goto :goto_1c6

    :catch_1bf
    nop

    goto :goto_1c6

    :cond_1c1
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setIsClippedToScreen(Z)V

    .line 17
    :cond_1c6
    :goto_1c6
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->ごづごきえ:Landroidx/appcompat/widget/ListPopupWindow$びぐびあび;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->てぜきぽく:Z

    if-eqz v0, :cond_1dd

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    iget-boolean v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぺふねづ〺:Z

    invoke-static {v0, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぁないぼぎへ(Landroid/widget/PopupWindow;Z)V

    :cond_1dd
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v3, :cond_1f3

    sget-object v0, Landroidx/appcompat/widget/ListPopupWindow;->ぅみぱぎぎ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1fa

    :try_start_1e5
    iget-object v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉ〲なぱぽた:Landroid/graphics/Rect;

    aput-object v5, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1f0
    .catch Ljava/lang/Exception; {:try_start_1e5 .. :try_end_1f0} :catch_1f1

    goto :goto_1fa

    :catch_1f1
    nop

    goto :goto_1fa

    :cond_1f3
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉ〲なぱぽた:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setEpicenterBounds(Landroid/graphics/Rect;)V

    :cond_1fa
    :goto_1fa
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    .line 18
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 19
    iget v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    iget v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    iget v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->のぷのちつ:I

    .line 20
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x13

    if-lt v6, v8, :cond_20e

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    goto :goto_228

    :cond_20e
    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v6

    invoke-static {v5, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result v5

    and-int/lit8 v5, v5, 0x7

    const/4 v6, 0x5

    if-ne v5, v6, :cond_225

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int/2addr v5, v6

    sub-int/2addr v3, v5

    :cond_225
    invoke-virtual {v0, v2, v3, v4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 21
    :goto_228
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {v0, v7}, Landroid/widget/ListView;->setSelection(I)V

    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇ〳〲〺すっ:Z

    if-eqz v0, :cond_239

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_243

    .line 22
    :cond_239
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    if-eqz v0, :cond_243

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->setListSelectionHidden(Z)V

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    .line 23
    :cond_243
    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇ〳〲〺すっ:Z

    if-nez v0, :cond_24e

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぶでにく〼〳:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->でどあくず:Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_24e
    :goto_24e
    return-void
.end method

.method public 〳ぜぞぜべっ(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public ぇぬぎばつ(Landroid/content/Context;Z)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;
    .registers 4

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-direct {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;-><init>(Landroid/content/Context;Z)V

    return-object v0
.end method

.method public ぉざぅち〻(I)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_18

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->〻ぞまぎな〻:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v0

    add-int/2addr v1, p1

    iput v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    goto :goto_1a

    .line 1
    :cond_18
    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    :goto_1a
    return-void
.end method

.method public おぐぴう〸ず(Landroid/widget/ListAdapter;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇぬぎばつ:Landroid/database/DataSetObserver;

    if-nez v0, :cond_c

    new-instance v0, Landroidx/appcompat/widget/ListPopupWindow$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ListPopupWindow$〺つふすそ;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇぬぎばつ:Landroid/database/DataSetObserver;

    goto :goto_13

    :cond_c
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_13

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_13
    :goto_13
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    if-eqz p1, :cond_1c

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇぬぎばつ:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_1c
    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    if-eqz p1, :cond_25

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_25
    return-void
.end method

.method public げつ〴ぬぐ()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    return v0
.end method

.method public ざとぅぼこ〺(Z)V
    .registers 3

    iput-boolean p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぇ〳〲〺すっ:Z

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method public づざかべべ()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public なぎぱいぢぎ()Landroid/widget/ListView;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    return-object v0
.end method

.method public のぷのちつ()I
    .registers 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->いいにぽつ:Z

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    iget v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    return v0
.end method

.method public ぺぁあねじ(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->いいにぽつ:Z

    return-void
.end method

.method public ぺふねづ〺(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    return-void
.end method
