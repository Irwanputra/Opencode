.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:[I

.field public static final げつ〴ぬぐ:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorPrimary:I

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ:[I

    new-array v0, v0, [I

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorPrimaryVariant:I

    aput v1, v0, v3

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ:[I

    return-void
.end method

.method public static varargs 〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V
    .registers 10

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ThemeEnforcement:[I

    invoke-virtual {p0, p1, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ThemeEnforcement_enforceTextAppearance:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_13
    const/4 v1, -0x1

    if-eqz p5, :cond_35

    array-length v3, p5

    if-nez v3, :cond_1a

    goto :goto_35

    .line 1
    :cond_1a
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    array-length p1, p5

    const/4 p2, 0x0

    :goto_20
    if-ge p2, p1, :cond_31

    aget p3, p5, p2

    invoke-virtual {p0, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    if-ne p3, v1, :cond_2e

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_3e

    :cond_2e
    add-int/lit8 p2, p2, 0x1

    goto :goto_20

    :cond_31
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_3d

    .line 2
    :cond_35
    :goto_35
    sget p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ThemeEnforcement_android_textAppearance:I

    invoke-virtual {v0, p0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    if-eq p0, v1, :cond_3e

    :goto_3d
    const/4 v2, 0x1

    :cond_3e
    :goto_3e
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v2, :cond_44

    return-void

    :cond_44
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4d

    :goto_4c
    throw p0

    :goto_4d
    goto :goto_4c
.end method

.method public static くし〴〺ぅ(Landroid/content/Context;[ILjava/lang/String;)V
    .registers 6

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_6
    array-length v2, p1

    if-ge v1, v2, :cond_16

    invoke-virtual {p0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-nez v2, :cond_13

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1a

    :cond_13
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_16
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    const/4 v0, 0x1

    :goto_1a
    if-eqz v0, :cond_1d

    return-void

    .line 2
    :cond_1d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The style on this component requires your app theme to be "

    const-string v0, " (or a descendant)."

    invoke-static {p1, p2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2c

    :goto_2b
    throw p0

    :goto_2c
    goto :goto_2b
.end method

.method public static げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 5

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ThemeEnforcement:[I

    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->ThemeEnforcement_enforceMaterialTheme:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_35

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->isMaterialTheme:I

    const/4 v0, 0x1

    invoke-virtual {p2, p3, p1, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p2

    if-eqz p2, :cond_2e

    iget p2, p1, Landroid/util/TypedValue;->type:I

    const/16 p3, 0x12

    if-ne p2, p3, :cond_35

    iget p1, p1, Landroid/util/TypedValue;->data:I

    if-nez p1, :cond_35

    .line 1
    :cond_2e
    sget-object p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ:[I

    const-string p2, "Theme.MaterialComponents"

    invoke-static {p0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->くし〴〺ぅ(Landroid/content/Context;[ILjava/lang/String;)V

    .line 2
    :cond_35
    sget-object p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ:[I

    const-string p2, "Theme.AppCompat"

    invoke-static {p0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->くし〴〺ぅ(Landroid/content/Context;[ILjava/lang/String;)V

    return-void
.end method

.method public static varargs づざかべべ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;
    .registers 6

    invoke-static {p0, p1, p3, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-static/range {p0 .. p5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 1
    new-instance p5, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p5, p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object p5
.end method

.method public static varargs びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    .registers 6

    invoke-static {p0, p1, p3, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-static/range {p0 .. p5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0
.end method
