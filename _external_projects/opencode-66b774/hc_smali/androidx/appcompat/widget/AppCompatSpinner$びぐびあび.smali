.class public Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;
.super Landroidx/appcompat/widget/ListPopupWindow;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final ぉひのべい:Landroid/graphics/Rect;

.field public じぜこほぱ:Ljava/lang/CharSequence;

.field public せづっ〸ちね:I

.field public final synthetic ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

.field public ぺづげぺが:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-direct {p0, p2, p3, p4}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぉひのべい:Landroid/graphics/Rect;

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    const/4 p2, 0x1

    .line 2
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺(Z)V

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Landroidx/appcompat/widget/ListPopupWindow;->おぐぴう〸ず:I

    .line 4
    new-instance p2, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$げつ〴ぬぐ;

    invoke-direct {p2, p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;Landroidx/appcompat/widget/AppCompatSpinner;)V

    .line 5
    iput-object p2, p0, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->じぜこほぱ:Ljava/lang/CharSequence;

    return-void
.end method

.method public いいにぽつ(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->せづっ〸ちね:I

    return-void
.end method

.method public おぐぴう〸ず(Landroid/widget/ListAdapter;)V
    .registers 2

    invoke-super {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow;->おぐぴう〸ず(Landroid/widget/ListAdapter;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぺづげぺが:Landroid/widget/ListAdapter;

    return-void
.end method

.method public てぜきぽく(II)V
    .registers 8

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->は〲ぱなで()V

    .line 1
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    if-lt v3, v4, :cond_22

    invoke-virtual {v1, p1}, Landroid/widget/ListView;->setTextDirection(I)V

    invoke-virtual {v1, p2}, Landroid/widget/ListView;->setTextAlignment(I)V

    :cond_22
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p1

    .line 5
    iget-object p2, p0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result v1

    if-eqz v1, :cond_42

    if-eqz p2, :cond_42

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->setListSelectionHidden(Z)V

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setSelection(I)V

    invoke-virtual {p2}, Landroid/widget/ListView;->getChoiceMode()I

    move-result v1

    if-eqz v1, :cond_42

    invoke-virtual {p2, p1, v2}, Landroid/widget/ListView;->setItemChecked(IZ)V

    :cond_42
    if-eqz v0, :cond_45

    return-void

    .line 6
    :cond_45
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_5f

    new-instance p2, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;-><init>(Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance p1, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$くし〴〺ぅ;

    invoke-direct {p1, p0, p2}, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_5f
    return-void
.end method

.method public は〲ぱなで()V
    .registers 9

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->づざかべべ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_26

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v1, v1, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-static {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    goto :goto_24

    :cond_1d
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    :goto_24
    move v1, v0

    goto :goto_2e

    :cond_26
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    :goto_2e
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getPaddingLeft()I

    move-result v0

    iget-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getPaddingRight()I

    move-result v2

    iget-object v3, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v3}, Landroid/widget/Spinner;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    iget v5, v4, Landroidx/appcompat/widget/AppCompatSpinner;->〳ぜぞぜべっ:I

    const/4 v6, -0x2

    if-ne v5, v6, :cond_78

    iget-object v5, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぺづげぺが:Landroid/widget/ListAdapter;

    check-cast v5, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->づざかべべ()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroidx/appcompat/widget/AppCompatSpinner;->げつ〴ぬぐ(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v4

    iget-object v5, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v5}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v6, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v6, v6, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    iget v7, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v7

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v6

    if-le v4, v5, :cond_70

    move v4, v5

    :cond_70
    sub-int v5, v3, v0

    sub-int/2addr v5, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_7e

    :cond_78
    const/4 v4, -0x1

    if-ne v5, v4, :cond_82

    sub-int v4, v3, v0

    sub-int/2addr v4, v2

    :goto_7e
    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻(I)V

    goto :goto_85

    :cond_82
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻(I)V

    :goto_85
    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-static {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_96

    sub-int/2addr v3, v2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->なぎぱいぢぎ:I

    sub-int/2addr v3, v0

    .line 2
    iget v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->せづっ〸ちね:I

    sub-int/2addr v3, v0

    add-int/2addr v3, v1

    goto :goto_9b

    :cond_96
    iget v2, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->せづっ〸ちね:I

    add-int/2addr v0, v2

    add-int v3, v0, v1

    .line 3
    :goto_9b
    iput v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->ぁごぐすすぃ:I

    return-void
.end method

.method public へぬ〴づぞ()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->じぜこほぱ:Ljava/lang/CharSequence;

    return-object v0
.end method
