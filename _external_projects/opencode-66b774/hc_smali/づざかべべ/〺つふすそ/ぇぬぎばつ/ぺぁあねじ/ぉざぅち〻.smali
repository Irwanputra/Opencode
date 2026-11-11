.class public final Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;
.source ""

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;
.implements Landroid/view/View$OnKeyListener;


# static fields
.field public static final ぶでにく〼〳:I


# instance fields
.field public final 〳ぜぞぜべっ:I

.field public final ぁごぐすすぃ:I

.field public final いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

.field public ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

.field public ぉざぅち〻:Landroid/view/ViewTreeObserver;

.field public おぐぴう〸ず:Landroid/view/View;

.field public final くし〴〺ぅ:Landroid/content/Context;

.field public ごづごきえ:I

.field public ざっざへづ:I

.field public ざとぅぼこ〺:Z

.field public final づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

.field public final てぜきぽく:Landroid/view/View$OnAttachStateChangeListener;

.field public でどあくず:Z

.field public final なぎぱいぢぎ:Z

.field public のぷのちつ:Landroid/widget/PopupWindow$OnDismissListener;

.field public は〲ぱなで:Z

.field public final びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public へぬ〴づぞ:Landroid/view/View;

.field public final ぺぁあねじ:I

.field public final ぺふねづ〺:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget v0, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_popup_menu_item_layout:I

    sput v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぶでにく〼〳:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;IIZ)V
    .registers 10

    invoke-direct {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;-><init>()V

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぺふねづ〺:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻$〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻$〺つふすそ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->てぜきぽく:Landroid/view/View$OnAttachStateChangeListener;

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざっざへづ:I

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Landroid/content/Context;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iput-boolean p6, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    new-instance v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    sget v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぶでにく〼〳:I

    invoke-direct {v1, p2, v0, p6, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/LayoutInflater;ZI)V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    iput p4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->〳ぜぞぜべっ:I

    iput p5, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぺぁあねじ:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    sget v1, Lづざかべべ/〺つふすそ/びぐびあび;->abc_config_prefDialogWidth:I

    invoke-virtual {p6, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p6

    invoke-static {v0, p6}, Ljava/lang/Math;->max(II)I

    move-result p6

    iput p6, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぁごぐすすぃ:I

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->へぬ〴づぞ:Landroid/view/View;

    new-instance p3, Landroidx/appcompat/widget/MenuPopupWindow;

    const/4 p6, 0x0

    invoke-direct {p3, p1, p6, p4, p5}, Landroidx/appcompat/widget/MenuPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    invoke-virtual {p2, p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->dismiss()V

    :cond_b
    return-void
.end method

.method public onDismiss()V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざとぅぼこ〺:Z

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 1
    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->くし〴〺ぅ(Z)V

    .line 2
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぉざぅち〻:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1a

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->おぐぴう〸ず:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぉざぅち〻:Landroid/view/ViewTreeObserver;

    :cond_1a
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぉざぅち〻:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぺふねづ〺:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぉざぅち〻:Landroid/view/ViewTreeObserver;

    :cond_24
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->おぐぴう〸ず:Landroid/view/View;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->てぜきぽく:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->のぷのちつ:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_32

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_32
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .registers 4

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_f

    const/16 p1, 0x52

    if-ne p2, p1, :cond_f

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->dismiss()V

    return p3

    :cond_f
    const/4 p1, 0x0

    return p1
.end method

.method public show()V
    .registers 8

    .line 1
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->〺つふすそ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_b

    :goto_8
    const/4 v1, 0x1

    goto/16 :goto_c6

    :cond_b
    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざとぅぼこ〺:Z

    if-nez v0, :cond_c6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->へぬ〴づぞ:Landroid/view/View;

    if-nez v0, :cond_15

    goto/16 :goto_c6

    :cond_15
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->おぐぴう〸ず:Landroid/view/View;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 2
    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 3
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 4
    iput-object p0, v0, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺:Landroid/widget/AdapterView$OnItemClickListener;

    .line 5
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺(Z)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->おぐぴう〸ず:Landroid/view/View;

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぉざぅち〻:Landroid/view/ViewTreeObserver;

    if-nez v3, :cond_2d

    const/4 v3, 0x1

    goto :goto_2e

    :cond_2d
    const/4 v3, 0x0

    :goto_2e
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    iput-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぉざぅち〻:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_3b

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぺふねづ〺:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v4, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3b
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->てぜきぽく:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 6
    iput-object v0, v3, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    .line 7
    iget v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざっざへづ:I

    .line 8
    iput v0, v3, Landroidx/appcompat/widget/ListPopupWindow;->のぷのちつ:I

    .line 9
    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->は〲ぱなで:Z

    const/4 v3, 0x0

    if-nez v0, :cond_5b

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Landroid/content/Context;

    iget v5, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぁごぐすすぃ:I

    invoke-static {v0, v3, v4, v5}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->おぐぴう〸ず(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ごづごきえ:I

    iput-boolean v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->は〲ぱなで:Z

    :cond_5b
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    iget v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ごづごきえ:I

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻(I)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    const/4 v4, 0x2

    .line 10
    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 11
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 12
    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->〺つふすそ:Landroid/graphics/Rect;

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v4, :cond_79

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v4}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_7a

    :cond_79
    move-object v5, v3

    :goto_7a
    iput-object v5, v0, Landroidx/appcompat/widget/ListPopupWindow;->ぉ〲なぱぽた:Landroid/graphics/Rect;

    .line 14
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 15
    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    .line 16
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->でどあくず:Z

    if-eqz v4, :cond_b8

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 17
    iget-object v4, v4, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:Ljava/lang/CharSequence;

    if-eqz v4, :cond_b8

    .line 18
    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    sget v5, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_popup_menu_header_item_layout:I

    invoke-virtual {v4, v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    const v5, 0x1020016

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_b2

    iget-object v6, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 19
    iget-object v6, v6, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:Ljava/lang/CharSequence;

    .line 20
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_b2
    invoke-virtual {v4, v1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    invoke-virtual {v0, v4, v3, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_b8
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->おぐぴう〸ず(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    goto/16 :goto_8

    :cond_c6
    :goto_c6
    if-eqz v1, :cond_c9

    return-void

    .line 21
    :cond_c9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_d2

    :goto_d1
    throw v0

    :goto_d2
    goto :goto_d1
.end method

.method public 〳ぜぞぜべっ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public 〺つふすそ()Z
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざとぅぼこ〺:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    return v0
.end method

.method public ぁごぐすすぃ(Z)V
    .registers 2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->は〲ぱなで:Z

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->notifyDataSetChanged()V

    :cond_a
    return-void
.end method

.method public ぇぬぎばつ(Landroid/view/View;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->へぬ〴づぞ:Landroid/view/View;

    return-void
.end method

.method public ぉざぅち〻(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    .line 1
    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->びぐびあび:Z

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eq p1, v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->dismiss()V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    if-eqz v0, :cond_f

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V

    :cond_f
    return-void
.end method

.method public ごづごきえ(Landroid/widget/PopupWindow$OnDismissListener;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->のぷのちつ:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public ざっざへづ(Z)V
    .registers 2

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->でどあくず:Z

    return-void
.end method

.method public ざとぅぼこ〺(I)V
    .registers 2

    iput p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざっざへづ:I

    return-void
.end method

.method public づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;)Z
    .registers 11

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_76

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Landroid/content/Context;

    iget-object v5, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->おぐぴう〸ず:Landroid/view/View;

    iget-boolean v6, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    iget v7, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->〳ぜぞぜべっ:I

    iget v8, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぺぁあねじ:I

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v8}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;-><init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;ZII)V

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    invoke-virtual {v0, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V

    invoke-static {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z

    move-result v2

    .line 1
    iput-boolean v2, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〳ぜぞぜべっ:Z

    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    if-eqz v3, :cond_2a

    invoke-virtual {v3, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ぉざぅち〻(Z)V

    .line 2
    :cond_2a
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->のぷのちつ:Landroid/widget/PopupWindow$OnDismissListener;

    .line 3
    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぺふねづ〺:Landroid/widget/PopupWindow$OnDismissListener;

    const/4 v2, 0x0

    .line 4
    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->のぷのちつ:Landroid/widget/PopupWindow$OnDismissListener;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v2, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->くし〴〺ぅ(Z)V

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 5
    iget v3, v2, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    .line 6
    iget-boolean v4, v2, Landroidx/appcompat/widget/ListPopupWindow;->いいにぽつ:Z

    if-nez v4, :cond_40

    const/4 v2, 0x0

    goto :goto_42

    :cond_40
    iget v2, v2, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    .line 7
    :goto_42
    iget v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ざっざへづ:I

    iget-object v5, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->へぬ〴づぞ:Landroid/view/View;

    invoke-static {v5}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_5a

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->へぬ〴づぞ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    .line 8
    :cond_5a
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_62

    goto :goto_6b

    :cond_62
    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    if-nez v4, :cond_68

    const/4 v0, 0x0

    goto :goto_6c

    :cond_68
    invoke-virtual {v0, v3, v2, v5, v5}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->づざかべべ(IIZZ)V

    :goto_6b
    const/4 v0, 0x1

    :goto_6c
    if-eqz v0, :cond_76

    .line 9
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    if-eqz v0, :cond_75

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z

    :cond_75
    return v5

    :cond_76
    return v1
.end method

.method public てぜきぽく(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    return-void
.end method

.method public でどあくず(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 1
    iput p1, v0, Landroidx/appcompat/widget/ListPopupWindow;->〳ぜぞぜべっ:I

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroidx/appcompat/widget/ListPopupWindow;->いいにぽつ:Z

    return-void
.end method

.method public なぎぱいぢぎ()Landroid/widget/ListView;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    return-object v0
.end method

.method public のぷのちつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    return-void
.end method

.method public は〲ぱなで(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;->いいにぽつ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 1
    iput p1, v0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    return-void
.end method

.method public びぐびあび(Landroid/os/Parcelable;)V
    .registers 2

    return-void
.end method

.method public ぺぁあねじ()Landroid/os/Parcelable;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method
