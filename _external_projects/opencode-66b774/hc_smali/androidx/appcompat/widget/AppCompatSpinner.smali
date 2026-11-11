.class public Landroidx/appcompat/widget/AppCompatSpinner;
.super Landroid/widget/Spinner;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;,
        Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;,
        Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;,
        Landroidx/appcompat/widget/AppCompatSpinner$くし〴〺ぅ;,
        Landroidx/appcompat/widget/AppCompatSpinner$SavedState;
    }
.end annotation


# static fields
.field public static final いいにぽつ:[I


# instance fields
.field public 〳ぜぞぜべっ:I

.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

.field public ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

.field public final くし〴〺ぅ:Landroid/content/Context;

.field public づざかべべ:Landroid/widget/SpinnerAdapter;

.field public final なぎぱいぢぎ:Z

.field public びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

.field public final ぺぁあねじ:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10102f1

    aput v2, v0, v1

    sput-object v0, Landroidx/appcompat/widget/AppCompatSpinner;->いいにぽつ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->spinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 11

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p0, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    sget-object v0, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner:[I

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 3
    new-instance v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-direct {v2, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;-><init>(Landroid/view/View;)V

    iput-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner_popupTheme:I

    .line 4
    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eqz v2, :cond_2f

    .line 5
    new-instance v3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;

    invoke-direct {v3, p1, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;-><init>(Landroid/content/Context;I)V

    iput-object v3, p0, Landroidx/appcompat/widget/AppCompatSpinner;->くし〴〺ぅ:Landroid/content/Context;

    goto :goto_31

    :cond_2f
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->くし〴〺ぅ:Landroid/content/Context;

    :goto_31
    const/4 v2, 0x0

    const/4 v3, -0x1

    :try_start_33
    sget-object v4, Landroidx/appcompat/widget/AppCompatSpinner;->いいにぽつ:[I

    invoke-virtual {p1, p2, v4, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4
    :try_end_39
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_39} :catch_50
    .catchall {:try_start_33 .. :try_end_39} :catchall_49

    :try_start_39
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_53

    invoke-virtual {v4, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_39 .. :try_end_43} :catch_47
    .catchall {:try_start_39 .. :try_end_43} :catchall_44

    goto :goto_53

    :catchall_44
    move-exception p1

    move-object v2, v4

    goto :goto_4a

    :catch_47
    nop

    goto :goto_51

    :catchall_49
    move-exception p1

    :goto_4a
    if-eqz v2, :cond_4f

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_4f
    throw p1

    :catch_50
    move-object v4, v2

    :goto_51
    if-eqz v4, :cond_56

    :cond_53
    :goto_53
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    :cond_56
    const/4 v4, 0x1

    if-eqz v3, :cond_96

    if-eq v3, v4, :cond_5c

    goto :goto_a6

    :cond_5c
    new-instance v3, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    iget-object v5, p0, Landroidx/appcompat/widget/AppCompatSpinner;->くし〴〺ぅ:Landroid/content/Context;

    invoke-direct {v3, p0, v5, p2, p3}, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iget-object v5, p0, Landroidx/appcompat/widget/AppCompatSpinner;->くし〴〺ぅ:Landroid/content/Context;

    sget-object v6, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner:[I

    invoke-static {v5, p2, v6, p3, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v1

    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner_android_dropDownWidth:I

    const/4 v6, -0x2

    invoke-virtual {v1, v5, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->てぜきぽく(II)I

    move-result v5

    iput v5, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〳ぜぞぜべっ:I

    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner_android_popupBackground:I

    invoke-virtual {v1, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 6
    iget-object v6, v3, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v6, v5}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner_android_prompt:I

    .line 8
    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 9
    iput-object v5, v3, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->じぜこほぱ:Ljava/lang/CharSequence;

    .line 10
    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    iput-object v3, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;

    invoke-direct {v1, p0, p0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;)V

    iput-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

    goto :goto_a6

    :cond_96
    new-instance v1, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;)V

    iput-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    sget v3, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner_android_prompt:I

    .line 12
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->ぁごぐすすぃ(Ljava/lang/CharSequence;)V

    :goto_a6
    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->Spinner_android_entries:I

    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_be

    .line 15
    new-instance v3, Landroid/widget/ArrayAdapter;

    const v5, 0x1090008

    invoke-direct {v3, p1, v5, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    sget p1, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->support_simple_spinner_dropdown_item:I

    invoke-virtual {v3, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 16
    :cond_be
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 17
    iput-boolean v4, p0, Landroidx/appcompat/widget/AppCompatSpinner;->なぎぱいぢぎ:Z

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->づざかべべ:Landroid/widget/SpinnerAdapter;

    if-eqz p1, :cond_cc

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iput-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->づざかべべ:Landroid/widget/SpinnerAdapter;

    :cond_cc
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->びぐびあび(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()V

    :cond_a
    return-void
.end method

.method public getDropDownHorizontalOffset()I
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->げつ〴ぬぐ()I

    move-result v0

    return v0

    :cond_9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_14

    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownHorizontalOffset()I

    move-result v0

    return v0

    :cond_14
    const/4 v0, 0x0

    return v0
.end method

.method public getDropDownVerticalOffset()I
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->のぷのちつ()I

    move-result v0

    return v0

    :cond_9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_14

    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownVerticalOffset()I

    move-result v0

    return v0

    :cond_14
    const/4 v0, 0x0

    return v0
.end method

.method public getDropDownWidth()I
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_7

    iget v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〳ぜぞぜべっ:I

    return v0

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_12

    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownWidth()I

    move-result v0

    return v0

    :cond_12
    const/4 v0, 0x0

    return v0
.end method

.method public final getInternalPopup()Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    return-object v0
.end method

.method public getPopupBackground()Landroid/graphics/drawable/Drawable;
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->づざかべべ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_14

    invoke-super {p0}, Landroid/widget/Spinner;->getPopupBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_14
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPopupContext()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->くし〴〺ぅ:Landroid/content/Context;

    return-object v0
.end method

.method public getPrompt()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->へぬ〴づぞ()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_d

    :cond_9
    invoke-super {p0}, Landroid/widget/Spinner;->getPrompt()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_d
    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

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

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/Spinner;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->dismiss()V

    :cond_12
    return-void
.end method

.method public onMeasure(II)V
    .registers 5

    invoke-super {p0, p1, p2}, Landroid/widget/Spinner;->onMeasure(II)V

    iget-object p2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz p2, :cond_32

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_32

    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/Spinner;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner;->げつ〴ぬぐ(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/widget/Spinner;->setMeasuredDimension(II)V

    :cond_32
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    check-cast p1, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/Spinner;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->〺つふすそ:Z

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_1b

    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatSpinner$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1b
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    invoke-super {p0}, Landroid/widget/Spinner;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v1, :cond_15

    invoke-interface {v1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->〺つふすそ()Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, 0x1

    goto :goto_16

    :cond_15
    const/4 v1, 0x0

    :goto_16
    iput-boolean v1, v0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->〺つふすそ:Z

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 p1, 0x1

    return p1

    :cond_c
    invoke-super {p0, p1}, Landroid/widget/Spinner;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->〺つふすそ()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ()V

    :cond_d
    const/4 v0, 0x1

    return v0

    :cond_f
    invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .registers 2

    check-cast p1, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/SpinnerAdapter;)V
    .registers 5

    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->なぎぱいぢぎ:Z

    if-nez v0, :cond_7

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->づざかべべ:Landroid/widget/SpinnerAdapter;

    return-void

    :cond_7
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->くし〴〺ぅ:Landroid/content/Context;

    if-nez v0, :cond_16

    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v0

    :cond_16
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    new-instance v2, Landroidx/appcompat/widget/AppCompatSpinner$くし〴〺ぅ;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Landroidx/appcompat/widget/AppCompatSpinner$くし〴〺ぅ;-><init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V

    invoke-interface {v1, v2}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->おぐぴう〸ず(Landroid/widget/ListAdapter;)V

    :cond_24
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->づざかべべ()V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ(I)V

    :cond_a
    return-void
.end method

.method public setDropDownHorizontalOffset(I)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->いいにぽつ(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->ぺふねづ〺(I)V

    goto :goto_16

    :cond_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_16

    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownHorizontalOffset(I)V

    :cond_16
    :goto_16
    return-void
.end method

.method public setDropDownVerticalOffset(I)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->ぺぁあねじ(I)V

    goto :goto_11

    :cond_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_11

    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V

    :cond_11
    :goto_11
    return-void
.end method

.method public setDropDownWidth(I)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_7

    iput p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〳ぜぞぜべっ:I

    goto :goto_10

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_10

    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownWidth(I)V

    :cond_10
    :goto_10
    return-void
.end method

.method public setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->〳ぜぞぜべっ(Landroid/graphics/drawable/Drawable;)V

    goto :goto_11

    :cond_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_11

    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_11
    :goto_11
    return-void
.end method

.method public setPopupBackgroundResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner;->getPopupContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPrompt(Ljava/lang/CharSequence;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->ぁごぐすすぃ(Ljava/lang/CharSequence;)V

    goto :goto_b

    :cond_8
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPrompt(Ljava/lang/CharSequence;)V

    :goto_b
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->ぺぁあねじ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public 〺つふすそ()V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_14

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    invoke-virtual {p0}, Landroid/widget/Spinner;->getTextDirection()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/Spinner;->getTextAlignment()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->てぜきぽく(II)V

    goto :goto_1a

    :cond_14
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぁごぐすすぃ:Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    const/4 v1, -0x1

    invoke-interface {v0, v1, v1}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->てぜきぽく(II)V

    :goto_1a
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
    .registers 13

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredWidth()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredHeight()I

    move-result v2

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v4

    add-int/lit8 v5, v3, 0xf

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, v4, v3

    rsub-int/lit8 v5, v5, 0xf

    sub-int/2addr v3, v5

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v5, 0x0

    move v6, v3

    move-object v7, v5

    const/4 v3, 0x0

    :goto_33
    if-ge v6, v4, :cond_5e

    invoke-interface {p1, v6}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v8, v0, :cond_3d

    move-object v7, v5

    move v0, v8

    :cond_3d
    invoke-interface {p1, v6, v7, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    if-nez v8, :cond_50

    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v8, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_50
    invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v6, v6, 0x1

    goto :goto_33

    :cond_5e
    if-eqz p2, :cond_6d

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->ぺぁあねじ:Landroid/graphics/Rect;

    iget p2, p1, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p2, p1

    add-int/2addr v3, p2

    :cond_6d
    return v3
.end method
