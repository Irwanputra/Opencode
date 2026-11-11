.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedAPI"
    }
.end annotation


# static fields
.field public static final 〺つふすそ:[I

.field public static final くし〴〺ぅ:Landroid/graphics/Rect;

.field public static final げつ〴ぬぐ:[I

.field public static びぐびあび:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x10100a0

    const/4 v2, 0x0

    aput v1, v0, v2

    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->げつ〴ぬぐ:[I

    new-array v0, v2, [I

    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->〺つふすそ:[I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ:Landroid/graphics/Rect;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_24

    :try_start_1c
    const-string v0, "android.graphics.Insets"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび:Ljava/lang/Class;
    :try_end_24
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1c .. :try_end_24} :catch_24

    :catch_24
    :cond_24
    return-void
.end method

.method public static 〺つふすそ(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_2e

    const-string v0, "android.graphics.drawable.VectorDrawable"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    if-eqz v0, :cond_26

    array-length v1, v0

    if-nez v1, :cond_20

    goto :goto_26

    :cond_20
    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->〺つふすそ:[I

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_2b

    :cond_26
    :goto_26
    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->げつ〴ぬぐ:[I

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_2b
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2e
    return-void
.end method

.method public static くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .registers 13

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_20

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpticalInsets()Landroid/graphics/Insets;

    move-result-object p0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget v1, p0, Landroid/graphics/Insets;->left:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    iget v1, p0, Landroid/graphics/Insets;->right:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iget v1, p0, Landroid/graphics/Insets;->top:I

    iput v1, v0, Landroid/graphics/Rect;->top:I

    iget p0, p0, Landroid/graphics/Insets;->bottom:I

    iput p0, v0, Landroid/graphics/Rect;->bottom:I

    return-object v0

    :cond_20
    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび:Ljava/lang/Class;

    if-eqz v0, :cond_ad

    :try_start_24
    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〵つてう(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getOpticalInsets"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_ad

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_4a
    if-ge v4, v3, :cond_ac

    aget-object v5, v1, v4

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    sparse-switch v8, :sswitch_data_b0

    goto :goto_85

    :sswitch_5e
    const-string v8, "right"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_85

    const/4 v7, 0x2

    goto :goto_85

    :sswitch_68
    const-string v8, "left"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_85

    const/4 v7, 0x0

    goto :goto_85

    :sswitch_72
    const-string v8, "top"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_85

    const/4 v7, 0x1

    goto :goto_85

    :sswitch_7c
    const-string v8, "bottom"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_85

    const/4 v7, 0x3

    :cond_85
    :goto_85
    if-eqz v7, :cond_a3

    if-eq v7, v11, :cond_9c

    if-eq v7, v10, :cond_95

    if-eq v7, v9, :cond_8e

    goto :goto_a9

    :cond_8e
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    iput v5, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_a9

    :cond_95
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    iput v5, v0, Landroid/graphics/Rect;->right:I

    goto :goto_a9

    :cond_9c
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    iput v5, v0, Landroid/graphics/Rect;->top:I

    goto :goto_a9

    :cond_a3
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    iput v5, v0, Landroid/graphics/Rect;->left:I
    :try_end_a9
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_a9} :catch_ad

    :goto_a9
    add-int/lit8 v4, v4, 0x1

    goto :goto_4a

    :cond_ac
    return-object v0

    :catch_ad
    :cond_ad
    sget-object p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ:Landroid/graphics/Rect;

    return-object p0

    :sswitch_data_b0
    .sparse-switch
        -0x527265d5 -> :sswitch_7c
        0x1c155 -> :sswitch_72
        0x32a007 -> :sswitch_68
        0x677c21c -> :sswitch_5e
    .end sparse-switch
.end method

.method public static げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)Z
    .registers 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    const/4 v2, 0x0

    if-ge v0, v1, :cond_c

    instance-of v0, p0, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_c

    return v2

    :cond_c
    instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer;

    if-eqz v0, :cond_2e

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p0

    instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;

    if-eqz v0, :cond_55

    check-cast p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;

    invoke-virtual {p0}, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;->getChildren()[Landroid/graphics/drawable/Drawable;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_20
    if-ge v1, v0, :cond_55

    aget-object v3, p0, v1

    invoke-static {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)Z

    move-result v3

    if-nez v3, :cond_2b

    return v2

    :cond_2b
    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    :cond_2e
    instance-of v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;

    if-eqz v0, :cond_3d

    check-cast p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;

    invoke-interface {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;->〺つふすそ()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    :goto_38
    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)Z

    move-result p0

    return p0

    :cond_3d
    instance-of v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;

    if-eqz v0, :cond_4a

    check-cast p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;

    .line 1
    iget-object p0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    .line 2
    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)Z

    move-result p0

    return p0

    :cond_4a
    instance-of v0, p0, Landroid/graphics/drawable/ScaleDrawable;

    if-eqz v0, :cond_55

    check-cast p0, Landroid/graphics/drawable/ScaleDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/ScaleDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    goto :goto_38

    :cond_55
    const/4 p0, 0x1

    return p0
.end method

.method public static びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    .registers 3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1d

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1a

    const/16 v0, 0x9

    if-eq p0, v0, :cond_17

    packed-switch p0, :pswitch_data_20

    return-object p1

    :pswitch_e
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_11
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_14
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_17
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_1a
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_1d
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_data_20
    .packed-switch 0xe
        :pswitch_14
        :pswitch_11
        :pswitch_e
    .end packed-switch
.end method
