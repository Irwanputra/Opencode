.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final くし〴〺ぅ:[I


# instance fields
.field public 〺つふすそ:Landroid/graphics/Bitmap;

.field public final げつ〴ぬぐ:Landroid/widget/ProgressBar;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_a

    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:[I

    return-void

    nop

    :array_a
    .array-data 4
        0x101013b
        0x101013c
    .end array-data
.end method

.method public constructor <init>(Landroid/widget/ProgressBar;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/widget/ProgressBar;

    return-void
.end method


# virtual methods
.method public final 〺つふすそ(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
    .registers 10

    instance-of v0, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;

    if-eqz v0, :cond_16

    move-object v0, p1

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;

    invoke-interface {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;->〺つふすそ()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_a3

    invoke-virtual {p0, v1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-interface {v0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_a3

    :cond_16
    instance-of v0, p1, Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_58

    check-cast p1, Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result p2

    new-array v0, p2, [Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_25
    if-ge v3, p2, :cond_46

    invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    move-result v4

    invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const v6, 0x102000d

    if-eq v4, v6, :cond_3c

    const v6, 0x102000f

    if-ne v4, v6, :cond_3a

    goto :goto_3c

    :cond_3a
    const/4 v4, 0x0

    goto :goto_3d

    :cond_3c
    :goto_3c
    const/4 v4, 0x1

    :goto_3d
    invoke-virtual {p0, v5, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    :cond_46
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    :goto_4b
    if-ge v2, p2, :cond_57

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4b

    :cond_57
    return-object v1

    :cond_58
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_a3

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ:Landroid/graphics/Bitmap;

    if-nez v2, :cond_68

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ:Landroid/graphics/Bitmap;

    :cond_68
    new-instance v2, Landroid/graphics/drawable/ShapeDrawable;

    const/16 v3, 0x8

    new-array v3, v3, [F

    .line 1
    fill-array-data v3, :array_a4

    new-instance v4, Landroid/graphics/drawable/shapes/RoundRectShape;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5, v5}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    .line 2
    invoke-direct {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    new-instance v3, Landroid/graphics/BitmapShader;

    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v3, v0, v4, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    if-eqz p2, :cond_a2

    new-instance p1, Landroid/graphics/drawable/ClipDrawable;

    const/4 p2, 0x3

    invoke-direct {p1, v2, p2, v1}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    move-object v2, p1

    :cond_a2
    return-object v2

    :cond_a3
    :goto_a3
    return-object p1

    :array_a4
    .array-data 4
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method public げつ〴ぬぐ(Landroid/util/AttributeSet;I)V
    .registers 11

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:[I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object p1

    invoke-virtual {p1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〳ぜぞぜべっ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x1

    if-eqz p2, :cond_4d

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/widget/ProgressBar;

    .line 1
    instance-of v3, p2, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v3, :cond_4a

    check-cast p2, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    const/4 v5, 0x0

    :goto_2d
    const/16 v6, 0x2710

    if-ge v5, v3, :cond_46

    invoke-virtual {p2, v5}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {p0, v7, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    invoke-virtual {p2, v5}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    move-result v6

    invoke-virtual {v4, v7, v6}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2d

    :cond_46
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z

    move-object p2, v4

    .line 2
    :cond_4a
    invoke-virtual {v1, p2}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4d
    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〳ぜぞぜべっ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_5c

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/widget/ProgressBar;

    invoke-virtual {p0, p2, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    :cond_5c
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
