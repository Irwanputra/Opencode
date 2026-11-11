.class public Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;
.super Landroid/widget/AutoCompleteTextView;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;


# static fields
.field public static final びぐびあび:[I


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

.field public final くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010176

    aput v2, v0, v1

    sput-object v0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->びぐびあび:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->autoCompleteTextViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    invoke-static {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->びぐびあび:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object p1

    invoke-virtual {p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-virtual {p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1
    :cond_26
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 2
    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->びぐびあび(Landroid/util/AttributeSet;I)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()V

    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_11
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〺つふすそ()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->くぎぶ〼のそ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->づざかべべ()V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ(I)V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いたぷすいだ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->ぺぁあねじ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 4

    invoke-super {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method
