.class public Landroidx/appcompat/widget/AppCompatImageView;
.super Landroid/widget/ImageView;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;
.implements Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/ぁごぐすすぃ;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

.field public final くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-static {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->びぐびあび(Landroid/util/AttributeSet;I)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->くし〴〺ぅ(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()V

    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->げつ〴ぬぐ()V

    :cond_11
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

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

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz v0, :cond_b

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_b

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->げつ〴ぬぐ:Landroid/content/res/ColorStateList;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz v0, :cond_b

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_b

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->〺つふすそ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-super {p0}, Landroid/widget/ImageView;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->づざかべべ()V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ(I)V

    :cond_a
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->げつ〴ぬぐ()V

    :cond_a
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->げつ〴ぬぐ()V

    :cond_a
    return-void
.end method

.method public setImageResource(I)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->びぐびあび(I)V

    :cond_7
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->げつ〴ぬぐ()V

    :cond_a
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->ぺぁあねじ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->づざかべべ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぁごぐすすぃ;->なぎぱいぢぎ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method
