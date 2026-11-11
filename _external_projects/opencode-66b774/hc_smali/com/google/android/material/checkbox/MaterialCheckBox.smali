.class public Lcom/google/android/material/checkbox/MaterialCheckBox;
.super Landroidx/appcompat/widget/AppCompatCheckBox;
.source ""


# static fields
.field public static final 〳ぜぞぜべっ:[[I

.field public static final ぁごぐすすぃ:I


# instance fields
.field public づざかべべ:Landroid/content/res/ColorStateList;

.field public なぎぱいぢぎ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_CompoundButton_CheckBox:I

    sput v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->ぁごぐすすぃ:I

    const/4 v0, 0x4

    new-array v0, v0, [[I

    const/4 v1, 0x2

    new-array v2, v1, [I

    fill-array-data v2, :array_2a

    const/4 v3, 0x0

    aput-object v2, v0, v3

    new-array v2, v1, [I

    fill-array-data v2, :array_32

    const/4 v3, 0x1

    aput-object v2, v0, v3

    new-array v2, v1, [I

    fill-array-data v2, :array_3a

    aput-object v2, v0, v1

    new-array v1, v1, [I

    fill-array-data v1, :array_42

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->〳ぜぞぜべっ:[[I

    return-void

    :array_2a
    .array-data 4
        0x101009e
        0x10100a0
    .end array-data

    :array_32
    .array-data 4
        0x101009e
        -0x10100a0
    .end array-data

    :array_3a
    .array-data 4
        -0x101009e
        0x10100a0
    .end array-data

    :array_42
    .array-data 4
        -0x101009e
        -0x10100a0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/checkbox/MaterialCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->checkboxStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/checkbox/MaterialCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 11

    sget v4, Lcom/google/android/material/checkbox/MaterialCheckBox;->ぁごぐすすぃ:I

    invoke-static {p1, p2, p3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialCheckBox:[I

    const/4 v6, 0x0

    new-array v5, v6, [I

    move-object v0, p1

    move-object v1, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialCheckBox_buttonTint:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-static {p1, p2, p3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱かけばぜぐ(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :cond_28
    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialCheckBox_useMaterialThemeColors:I

    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->なぎぱいぢぎ:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->づざかべべ:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_46

    sget-object v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->〳ぜぞぜべっ:[[I

    array-length v1, v0

    new-array v1, v1, [I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorControlActivated:I

    invoke-static {p0, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorSurface:I

    invoke-static {p0, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v3

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorOnSurface:I

    invoke-static {p0, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v4

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v2, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v2

    aput v2, v1, v5

    const/4 v2, 0x1

    const v5, 0x3f0a3d71    # 0.54f

    invoke-static {v3, v4, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v5

    aput v5, v1, v2

    const/4 v2, 0x2

    const v5, 0x3ec28f5c    # 0.38f

    invoke-static {v3, v4, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v6

    aput v6, v1, v2

    const/4 v2, 0x3

    invoke-static {v3, v4, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v3

    aput v3, v1, v2

    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v2, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->づざかべべ:Landroid/content/res/ColorStateList;

    :cond_46
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->づざかべべ:Landroid/content/res/ColorStateList;

    return-object v0
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/CheckBox;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_11

    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺづげぺが(Landroid/widget/CompoundButton;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_11

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setUseMaterialThemeColors(Z)V

    :cond_11
    return-void
.end method

.method public setUseMaterialThemeColors(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->なぎぱいぢぎ:Z

    if-eqz p1, :cond_9

    invoke-direct {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_a

    :cond_9
    const/4 p1, 0x0

    :goto_a
    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱かけばぜぐ(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method
