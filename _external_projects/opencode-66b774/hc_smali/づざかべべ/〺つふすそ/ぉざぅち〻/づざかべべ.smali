.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/content/res/ColorStateList;

.field public くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

.field public final げつ〴ぬぐ:Landroid/widget/CompoundButton;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/widget/CompoundButton;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->びぐびあび:Z

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:Z

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)I
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_13

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->じぜこほぱ(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    add-int/2addr p1, v0

    :cond_13
    return p1
.end method

.method public くし〴〺ぅ(Landroid/util/AttributeSet;I)V
    .registers 12

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->CompoundButton:[I

    const/4 v8, 0x0

    invoke-static {v0, p1, v3, p2, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 1
    iget-object v5, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    const/4 v7, 0x0

    move-object v4, p1

    move v6, p2

    .line 2
    invoke-static/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :try_start_1b
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->CompoundButton_buttonCompat:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_38

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p1
    :try_end_27
    .catchall {:try_start_1b .. :try_end_27} :catchall_8f

    if-eqz p1, :cond_38

    :try_start_29
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_36
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_29 .. :try_end_36} :catch_38
    .catchall {:try_start_29 .. :try_end_36} :catchall_8f

    const/4 p1, 0x1

    goto :goto_39

    :catch_38
    :cond_38
    const/4 p1, 0x0

    :goto_39
    if-nez p1, :cond_56

    :try_start_3b
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->CompoundButton_android_button:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_56

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p1

    if-eqz p1, :cond_56

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_56
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->CompoundButton_buttonTint:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_67

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p2, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱かけばぜぐ(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :cond_67
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->CompoundButton_buttonTintMode:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_91

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result p1

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_85

    invoke-virtual {p2, p1}, Landroid/widget/CompoundButton;->setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_91

    :cond_85
    instance-of v1, p2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/づざかべべ;

    if-eqz v1, :cond_91

    check-cast p2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/づざかべべ;

    invoke-interface {p2, p1}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/づざかべべ;->setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_8e
    .catchall {:try_start_3b .. :try_end_8e} :catchall_8f

    goto :goto_91

    :catchall_8f
    move-exception p1

    goto :goto_97

    .line 4
    :cond_91
    :goto_91
    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :goto_97
    iget-object p2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 5
    throw p1
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->じぜこほぱ(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_3e

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->びぐびあび:Z

    if-nez v1, :cond_10

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:Z

    if-eqz v1, :cond_3e

    :cond_10
    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->びぐびあび:Z

    if-eqz v1, :cond_21

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_21
    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:Z

    if-eqz v1, :cond_2a

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2a
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_39

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_39
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ:Landroid/widget/CompoundButton;

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3e
    return-void
.end method
