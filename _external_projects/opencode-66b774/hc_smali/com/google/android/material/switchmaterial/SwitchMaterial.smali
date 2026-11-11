.class public Lcom/google/android/material/switchmaterial/SwitchMaterial;
.super Landroidx/appcompat/widget/SwitchCompat;
.source ""


# static fields
.field public static final こ〲しでおか:[[I

.field public static final ごまけがぢは:I


# instance fields
.field public えがぐせほち:Landroid/content/res/ColorStateList;

.field public ち〴みぎ〻び:Landroid/content/res/ColorStateList;

.field public final ておぞぞはね:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

.field public ばおぢでぎか:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_CompoundButton_Switch:I

    sput v0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ごまけがぢは:I

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

    sput-object v0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->こ〲しでおか:[[I

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

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/switchmaterial/SwitchMaterial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->switchStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/switchmaterial/SwitchMaterial;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 10

    sget v4, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ごまけがぢは:I

    invoke-static {p1, p2, p3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-direct {p1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ておぞぞはね:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->SwitchMaterial:[I

    const/4 p1, 0x0

    new-array v5, p1, [I

    move-object v1, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->SwitchMaterial_useMaterialThemeColors:I

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ばおぢでぎか:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getMaterialThemeColorsThumbTintList()Landroid/content/res/ColorStateList;
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ち〴みぎ〻び:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_50

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorSurface:I

    invoke-static {p0, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v0

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorControlActivated:I

    invoke-static {p0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_switch_thumb_elevation:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ておぞぞはね:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    .line 1
    iget-boolean v3, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v3, :cond_25

    .line 2
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぷぞてのほき(Landroid/view/View;)F

    move-result v3

    add-float/2addr v2, v3

    :cond_25
    iget-object v3, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ておぞぞはね:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-virtual {v3, v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->げつ〴ぬぐ(IF)I

    move-result v2

    sget-object v3, Lcom/google/android/material/switchmaterial/SwitchMaterial;->こ〲しでおか:[[I

    array-length v4, v3

    new-array v4, v4, [I

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v6

    aput v6, v4, v5

    const/4 v5, 0x1

    aput v2, v4, v5

    const/4 v5, 0x2

    const v6, 0x3ec28f5c    # 0.38f

    invoke-static {v0, v1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v0

    aput v0, v4, v5

    const/4 v0, 0x3

    aput v2, v4, v0

    new-instance v0, Landroid/content/res/ColorStateList;

    invoke-direct {v0, v3, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ち〴みぎ〻び:Landroid/content/res/ColorStateList;

    :cond_50
    iget-object v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ち〴みぎ〻び:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method private getMaterialThemeColorsTrackTintList()Landroid/content/res/ColorStateList;
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->えがぐせほち:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_47

    sget-object v0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->こ〲しでおか:[[I

    array-length v1, v0

    new-array v1, v1, [I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorSurface:I

    invoke-static {p0, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorControlActivated:I

    invoke-static {p0, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v3

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorOnSurface:I

    invoke-static {p0, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v4

    const/4 v5, 0x0

    const v6, 0x3f0a3d71    # 0.54f

    invoke-static {v2, v3, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v6

    aput v6, v1, v5

    const/4 v5, 0x1

    const v6, 0x3ea3d70a    # 0.32f

    invoke-static {v2, v4, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v6

    aput v6, v1, v5

    const/4 v5, 0x2

    const v6, 0x3df5c28f    # 0.12f

    invoke-static {v2, v3, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v3

    aput v3, v1, v5

    const/4 v3, 0x3

    invoke-static {v2, v4, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result v2

    aput v2, v1, v3

    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v2, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->えがぐせほち:Landroid/content/res/ColorStateList;

    :cond_47
    iget-object v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->えがぐせほち:Landroid/content/res/ColorStateList;

    return-object v0
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/CompoundButton;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ばおぢでぎか:Z

    if-eqz v0, :cond_14

    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_14

    invoke-direct {p0}, Lcom/google/android/material/switchmaterial/SwitchMaterial;->getMaterialThemeColorsThumbTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    :cond_14
    iget-boolean v0, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ばおぢでぎか:Z

    if-eqz v0, :cond_25

    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->getTrackTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_25

    invoke-direct {p0}, Lcom/google/android/material/switchmaterial/SwitchMaterial;->getMaterialThemeColorsTrackTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    :cond_25
    return-void
.end method

.method public setUseMaterialThemeColors(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/material/switchmaterial/SwitchMaterial;->ばおぢでぎか:Z

    if-eqz p1, :cond_10

    invoke-direct {p0}, Lcom/google/android/material/switchmaterial/SwitchMaterial;->getMaterialThemeColorsThumbTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/google/android/material/switchmaterial/SwitchMaterial;->getMaterialThemeColorsTrackTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_14

    :cond_10
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    :goto_14
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
