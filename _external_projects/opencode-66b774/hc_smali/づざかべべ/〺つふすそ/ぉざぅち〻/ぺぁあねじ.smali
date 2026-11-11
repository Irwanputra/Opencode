.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

.field public づざかべべ:Landroid/graphics/drawable/Drawable;

.field public なぎぱいぢぎ:Landroid/content/res/ColorStateList;

.field public final びぐびあび:Landroid/widget/SeekBar;

.field public ぺぁあねじ:Z


# direct methods
.method public constructor <init>(Landroid/widget/SeekBar;)V
    .registers 3

    invoke-direct {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;-><init>(Landroid/widget/ProgressBar;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->なぎぱいぢぎ:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->〳ぜぞぜべっ:Z

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぺぁあねじ:Z

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    return-void
.end method


# virtual methods
.method public final くし〴〺ぅ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3d

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->〳ぜぞぜべっ:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぺぁあねじ:Z

    if-eqz v1, :cond_3d

    :cond_c
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->〳ぜぞぜべっ:Z

    if-eqz v1, :cond_1f

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->なぎぱいぢぎ:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1f
    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぺぁあねじ:Z

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2a
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3d

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3d
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/util/AttributeSet;I)V
    .registers 11

    invoke-super {p0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/util/AttributeSet;I)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatSeekBar:[I

    const/4 v1, 0x0

    invoke-static {v0, p1, v3, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 1
    iget-object v5, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    const/4 v7, 0x0

    move-object v4, p1

    move v6, p2

    .line 2
    invoke-static/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatSeekBar_android_thumb:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〳ぜぞぜべっ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2b

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    :cond_2b
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatSeekBar_tickMark:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_39

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_39
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_5d

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result p2

    invoke-static {p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぉねぞはがぞ(Landroid/graphics/drawable/Drawable;I)Z

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p2

    if-eqz p2, :cond_5a

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {p2}, Landroid/widget/SeekBar;->getDrawableState()[I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_5a
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->くし〴〺ぅ()V

    :cond_5d
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {p1}, Landroid/widget/SeekBar;->invalidate()V

    .line 4
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatSeekBar_tickMarkTintMode:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_7a

    const/4 p2, -0x1

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result p1

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->ぺぁあねじ:Z

    :cond_7a
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatSeekBar_tickMarkTint:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_8a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->なぎぱいぢぎ:Landroid/content/res/ColorStateList;

    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->〳ぜぞぜべっ:Z

    .line 5
    :cond_8a
    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->くし〴〺ぅ()V

    return-void
.end method

.method public びぐびあび(Landroid/graphics/Canvas;)V
    .registers 8

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_6a

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getMax()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_6a

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    if-ltz v2, :cond_1e

    div-int/lit8 v2, v2, 0x2

    goto :goto_1f

    :cond_1e
    const/4 v2, 0x1

    :goto_1f
    if-ltz v3, :cond_23

    div-int/lit8 v1, v3, 0x2

    :cond_23
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    neg-int v4, v2

    neg-int v5, v1

    invoke-virtual {v3, v4, v5, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getWidth()I

    move-result v1

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    int-to-float v2, v0

    div-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->びぐびあび:Landroid/widget/SeekBar;

    invoke-virtual {v4}, Landroid/widget/SeekBar;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v3, 0x0

    :goto_59
    if-gt v3, v0, :cond_67

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺぁあねじ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    const/4 v4, 0x0

    invoke-virtual {p1, v1, v4}, Landroid/graphics/Canvas;->translate(FF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_59

    :cond_67
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_6a
    return-void
.end method
