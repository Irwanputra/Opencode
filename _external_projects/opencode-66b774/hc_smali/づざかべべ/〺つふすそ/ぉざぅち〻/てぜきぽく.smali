.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public ぁごぐすすぃ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public いいにぽつ:I

.field public くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public final げつ〴ぬぐ:Landroid/widget/TextView;

.field public づざかべべ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public てぜきぽく:Landroid/graphics/Typeface;

.field public なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public のぷのちつ:Z

.field public びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

.field public final ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-direct {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    return-void
.end method

.method public static くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;
    .registers 3

    invoke-virtual {p1, p0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->びぐびあび(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_11

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-direct {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->びぐびあび:Z

    iput-object p0, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->げつ〴ぬぐ:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_11
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public 〳ぜぞぜべっ([II)V
    .registers 9

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ()Z

    move-result v1

    if-eqz v1, :cond_60

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_55

    new-array v3, v1, [I

    if-nez p2, :cond_15

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_31

    :cond_15
    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_1f
    if-ge v2, v1, :cond_31

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1f

    :cond_31
    :goto_31
    invoke-virtual {v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->くし〴〺ぅ([I)[I

    move-result-object p2

    iput-object p2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ:[I

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぺぁあねじ()Z

    move-result p2

    if-eqz p2, :cond_3e

    goto :goto_57

    :cond_3e
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "None of the preset sizes is valid: "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_55
    iput-boolean v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぁごぐすすぃ:Z

    :goto_57
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〳ぜぞぜべっ()Z

    move-result p1

    if-eqz p1, :cond_60

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    :cond_60
    return-void
.end method

.method public 〺つふすそ()V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_12

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-nez v0, :cond_12

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-nez v0, :cond_12

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_36

    :cond_12
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-virtual {p0, v3, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-virtual {p0, v3, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V

    aget-object v3, v0, v1

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-virtual {p0, v3, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-virtual {p0, v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V

    :cond_36
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v0, v3, :cond_58

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-nez v0, :cond_44

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_58

    :cond_44
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-virtual {p0, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-virtual {p0, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V

    :cond_58
    return-void
.end method

.method public ぁごぐすすぃ(IIII)V
    .registers 7

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ()Z

    move-result v1

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぺふねづ〺(FFF)V

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〳ぜぞぜべっ()Z

    move-result p1

    if-eqz p1, :cond_2d

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    :cond_2d
    return-void
.end method

.method public いいにぽつ(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-direct {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_b
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->げつ〴ぬぐ:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_13

    const/4 p1, 0x1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    :goto_14
    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->びぐびあび:Z

    .line 1
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;)V
    .registers 4

    if-eqz p1, :cond_d

    if-eqz p2, :cond_d

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->なぎぱいぢぎ(Landroid/graphics/drawable/Drawable;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;[I)V

    :cond_d
    return-void
.end method

.method public づざかべべ(Landroid/util/AttributeSet;I)V
    .registers 26
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->げつ〴ぬぐ()Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;

    move-result-object v11

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper:[I

    const/4 v12, 0x0

    invoke-static {v10, v8, v3, v9, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v13

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 1
    iget-object v5, v13, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    const/4 v7, 0x0

    move-object/from16 v4, p1

    move/from16 v6, p2

    .line 2
    invoke-static/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_textAppearance:I

    const/4 v14, -0x1

    invoke-virtual {v13, v1, v14}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v1

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_drawableLeft:I

    invoke-virtual {v13, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_40

    invoke-virtual {v13, v2, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    move-result-object v2

    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_40
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_drawableTop:I

    invoke-virtual {v13, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_52

    invoke-virtual {v13, v2, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    move-result-object v2

    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_52
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_drawableRight:I

    invoke-virtual {v13, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_64

    invoke-virtual {v13, v2, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    move-result-object v2

    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_64
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_drawableBottom:I

    invoke-virtual {v13, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_76

    invoke-virtual {v13, v2, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    move-result-object v2

    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_76
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x11

    if-lt v2, v15, :cond_a0

    sget v3, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_drawableStart:I

    invoke-virtual {v13, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v4

    if-eqz v4, :cond_8e

    invoke-virtual {v13, v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v3

    invoke-static {v10, v11, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    move-result-object v3

    iput-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_8e
    sget v3, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextHelper_android_drawableEnd:I

    invoke-virtual {v13, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v4

    if-eqz v4, :cond_a0

    invoke-virtual {v13, v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v3

    invoke-static {v10, v11, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    move-result-object v3

    iput-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    .line 3
    :cond_a0
    iget-object v3, v13, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v3

    instance-of v3, v3, Landroid/text/method/PasswordTransformationMethod;

    const/16 v4, 0x17

    const/16 v5, 0x1a

    if-eq v1, v14, :cond_127

    sget-object v6, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance:[I

    .line 5
    new-instance v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    invoke-virtual {v10, v1, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-direct {v7, v10, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v3, :cond_ce

    .line 6
    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_textAllCaps:I

    invoke-virtual {v7, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v6

    if-eqz v6, :cond_ce

    invoke-virtual {v7, v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v1

    const/4 v6, 0x1

    goto :goto_d0

    :cond_ce
    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_d0
    invoke-virtual {v0, v10, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;)V

    if-ge v2, v4, :cond_100

    sget v15, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColor:I

    invoke-virtual {v7, v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v17

    if-eqz v17, :cond_e2

    invoke-virtual {v7, v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v15

    goto :goto_e3

    :cond_e2
    const/4 v15, 0x0

    :goto_e3
    sget v13, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColorHint:I

    invoke-virtual {v7, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v18

    if-eqz v18, :cond_f0

    invoke-virtual {v7, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v13

    goto :goto_f1

    :cond_f0
    const/4 v13, 0x0

    :goto_f1
    sget v14, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColorLink:I

    invoke-virtual {v7, v14}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v19

    if-eqz v19, :cond_fe

    invoke-virtual {v7, v14}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v14

    goto :goto_103

    :cond_fe
    const/4 v14, 0x0

    goto :goto_103

    :cond_100
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_103
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_textLocale:I

    invoke-virtual {v7, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v20

    if-eqz v20, :cond_110

    invoke-virtual {v7, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_111

    :cond_110
    const/4 v4, 0x0

    :goto_111
    if-lt v2, v5, :cond_120

    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v7, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v21

    if-eqz v21, :cond_120

    invoke-virtual {v7, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_121

    :cond_120
    const/4 v5, 0x0

    .line 7
    :goto_121
    iget-object v7, v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_12e

    :cond_127
    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 8
    :goto_12e
    sget-object v7, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance:[I

    move/from16 v21, v1

    .line 9
    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    invoke-virtual {v10, v8, v7, v9, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v7

    invoke-direct {v1, v10, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v3, :cond_14b

    .line 10
    sget v7, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_textAllCaps:I

    invoke-virtual {v1, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v22

    if-eqz v22, :cond_14b

    invoke-virtual {v1, v7, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v6

    const/4 v7, 0x1

    goto :goto_14e

    :cond_14b
    move v7, v6

    move/from16 v6, v21

    :goto_14e
    const/16 v12, 0x17

    if-ge v2, v12, :cond_176

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColor:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v21

    if-eqz v21, :cond_15e

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v15

    :cond_15e
    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColorHint:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v21

    if-eqz v21, :cond_16a

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v13

    :cond_16a
    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColorLink:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v21

    if-eqz v21, :cond_176

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v14

    :cond_176
    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_textLocale:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v21

    if-eqz v21, :cond_182

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v4

    :cond_182
    const/16 v12, 0x1a

    if-lt v2, v12, :cond_192

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v20

    if-eqz v20, :cond_192

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v5

    :cond_192
    const/16 v12, 0x1c

    if-lt v2, v12, :cond_1af

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textSize:I

    invoke-virtual {v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v20

    if-eqz v20, :cond_1af

    move-object/from16 v20, v11

    const/4 v11, -0x1

    invoke-virtual {v1, v12, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v12

    if-nez v12, :cond_1b1

    iget-object v11, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    const/4 v12, 0x0

    const/4 v8, 0x0

    invoke-virtual {v11, v8, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_1b1

    :cond_1af
    move-object/from16 v20, v11

    :cond_1b1
    :goto_1b1
    invoke-virtual {v0, v10, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;)V

    .line 11
    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v15, :cond_1c0

    .line 12
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1c0
    if-eqz v13, :cond_1c7

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1c7
    if-eqz v14, :cond_1ce

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1ce
    if-nez v3, :cond_1d7

    if-eqz v7, :cond_1d7

    .line 13
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 14
    :cond_1d7
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    if-eqz v1, :cond_1ed

    iget v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    const/4 v6, -0x1

    if-ne v3, v6, :cond_1e8

    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    iget v6, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-virtual {v3, v1, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_1ed

    :cond_1e8
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1ed
    :goto_1ed
    if-eqz v5, :cond_1f4

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    :cond_1f4
    const/16 v8, 0x18

    if-eqz v4, :cond_21d

    if-lt v2, v8, :cond_204

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-static {v4}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V

    goto :goto_21d

    :cond_204
    const/16 v1, 0x15

    if-lt v2, v1, :cond_21d

    const/16 v1, 0x2c

    invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-static {v1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    goto :goto_21e

    :cond_21d
    :goto_21d
    const/4 v2, 0x0

    :goto_21e
    iget-object v11, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 15
    iget-object v1, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ:Landroid/content/Context;

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView:[I

    move-object/from16 v12, p1

    invoke-virtual {v1, v12, v3, v9, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v13

    iget-object v1, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぺぁあねじ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v7, 0x0

    move-object/from16 v4, p1

    move-object v5, v13

    move/from16 v6, p2

    const/4 v9, 0x0

    invoke-static/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_autoSizeTextType:I

    invoke-virtual {v13, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_249

    const/4 v2, 0x0

    invoke-virtual {v13, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    :cond_249
    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_autoSizeStepGranularity:I

    invoke-virtual {v13, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    const/high16 v3, -0x40800000    # -1.0f

    if-eqz v2, :cond_258

    invoke-virtual {v13, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    goto :goto_25a

    :cond_258
    const/high16 v1, -0x40800000    # -1.0f

    :goto_25a
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_autoSizeMinTextSize:I

    invoke-virtual {v13, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_267

    invoke-virtual {v13, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    goto :goto_269

    :cond_267
    const/high16 v2, -0x40800000    # -1.0f

    :goto_269
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_autoSizeMaxTextSize:I

    invoke-virtual {v13, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_276

    invoke-virtual {v13, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    goto :goto_278

    :cond_276
    const/high16 v4, -0x40800000    # -1.0f

    :goto_278
    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_autoSizePresetSizes:I

    invoke-virtual {v13, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_2b0

    const/4 v6, 0x0

    invoke-virtual {v13, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-lez v5, :cond_2b0

    invoke-virtual {v13}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 16
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->length()I

    move-result v6

    new-array v7, v6, [I

    if-lez v6, :cond_2ad

    const/4 v14, 0x0

    :goto_298
    if-ge v14, v6, :cond_2a4

    const/4 v15, -0x1

    invoke-virtual {v5, v14, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v16

    aput v16, v7, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_298

    :cond_2a4
    invoke-virtual {v11, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->くし〴〺ぅ([I)[I

    move-result-object v6

    iput-object v6, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ:[I

    invoke-virtual {v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぺぁあねじ()Z

    .line 17
    :cond_2ad
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    :cond_2b0
    invoke-virtual {v13}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ()Z

    move-result v5

    const/4 v6, 0x2

    if-eqz v5, :cond_2ee

    iget v5, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    const/4 v7, 0x1

    if-ne v5, v7, :cond_2f1

    iget-boolean v5, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぁごぐすすぃ:Z

    if-nez v5, :cond_2ea

    iget-object v5, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    cmpl-float v7, v2, v3

    if-nez v7, :cond_2d7

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v6, v2, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    :cond_2d7
    cmpl-float v7, v4, v3

    if-nez v7, :cond_2e1

    const/high16 v4, 0x42e00000    # 112.0f

    invoke-static {v6, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    :cond_2e1
    cmpl-float v5, v1, v3

    if-nez v5, :cond_2e7

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_2e7
    invoke-virtual {v11, v2, v4, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぺふねづ〺(FFF)V

    :cond_2ea
    invoke-virtual {v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〳ぜぞぜべっ()Z

    goto :goto_2f1

    :cond_2ee
    const/4 v1, 0x0

    iput v1, v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    .line 18
    :cond_2f1
    :goto_2f1
    sget-boolean v1, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v1, :cond_330

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 19
    iget v2, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    if-eqz v2, :cond_330

    .line 20
    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ:[I

    .line 21
    array-length v2, v1

    if-lez v2, :cond_330

    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_32a

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 22
    iget v2, v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->びぐびあび:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 23
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 24
    iget v3, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->づざかべべ:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 25
    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 26
    iget v4, v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->くし〴〺ぅ:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v5, 0x0

    .line 27
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_330

    :cond_32a
    const/4 v5, 0x0

    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v5}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    :cond_330
    :goto_330
    sget-object v1, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView:[I

    .line 28
    invoke-virtual {v10, v12, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 29
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableLeftCompat:I

    const/4 v3, -0x1

    .line 30
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v3, :cond_346

    move-object/from16 v4, v20

    .line 31
    invoke-virtual {v4, v10, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_349

    :cond_346
    move-object/from16 v4, v20

    move-object v7, v9

    :goto_349
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableTopCompat:I

    .line 32
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v3, :cond_356

    .line 33
    invoke-virtual {v4, v10, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_357

    :cond_356
    move-object v2, v9

    :goto_357
    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableRightCompat:I

    .line 34
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-eq v5, v3, :cond_364

    .line 35
    invoke-virtual {v4, v10, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_365

    :cond_364
    move-object v5, v9

    :goto_365
    sget v11, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableBottomCompat:I

    .line 36
    invoke-virtual {v1, v11, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    if-eq v11, v3, :cond_372

    .line 37
    invoke-virtual {v4, v10, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    goto :goto_373

    :cond_372
    move-object v11, v9

    :goto_373
    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableStartCompat:I

    .line 38
    invoke-virtual {v1, v12, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    if-eq v12, v3, :cond_380

    .line 39
    invoke-virtual {v4, v10, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    goto :goto_381

    :cond_380
    move-object v12, v9

    :goto_381
    sget v13, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableEndCompat:I

    .line 40
    invoke-virtual {v1, v13, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    if-eq v13, v3, :cond_38e

    .line 41
    invoke-virtual {v4, v10, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/なぎぱいぢぎ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_38f

    :cond_38e
    move-object v3, v9

    .line 42
    :goto_38f
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v13, 0x3

    const/16 v14, 0x11

    if-lt v4, v14, :cond_3bd

    if-nez v12, :cond_39a

    if-eqz v3, :cond_3bd

    :cond_39a
    iget-object v5, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iget-object v7, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    if-eqz v12, :cond_3a5

    goto :goto_3a9

    :cond_3a5
    const/4 v12, 0x0

    aget-object v14, v5, v12

    move-object v12, v14

    :goto_3a9
    if-eqz v2, :cond_3ac

    goto :goto_3af

    :cond_3ac
    const/4 v2, 0x1

    aget-object v2, v5, v2

    :goto_3af
    if-eqz v3, :cond_3b2

    goto :goto_3b4

    :cond_3b2
    aget-object v3, v5, v6

    :goto_3b4
    if-eqz v11, :cond_3b7

    goto :goto_3b9

    :cond_3b7
    aget-object v11, v5, v13

    :goto_3b9
    invoke-virtual {v7, v12, v2, v3, v11}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_40f

    :cond_3bd
    if-nez v7, :cond_3c5

    if-nez v2, :cond_3c5

    if-nez v5, :cond_3c5

    if-eqz v11, :cond_40f

    :cond_3c5
    const/16 v3, 0x11

    if-lt v4, v3, :cond_3ed

    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const/4 v12, 0x0

    aget-object v14, v3, v12

    if-nez v14, :cond_3d8

    aget-object v14, v3, v6

    if-eqz v14, :cond_3ed

    :cond_3d8
    iget-object v5, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    aget-object v7, v3, v12

    if-eqz v2, :cond_3df

    goto :goto_3e2

    :cond_3df
    const/4 v2, 0x1

    aget-object v2, v3, v2

    :goto_3e2
    aget-object v6, v3, v6

    if-eqz v11, :cond_3e7

    goto :goto_3e9

    :cond_3e7
    aget-object v11, v3, v13

    :goto_3e9
    invoke-virtual {v5, v7, v2, v6, v11}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_40f

    :cond_3ed
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iget-object v12, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    if-eqz v7, :cond_3f8

    goto :goto_3fc

    :cond_3f8
    const/4 v7, 0x0

    aget-object v14, v3, v7

    move-object v7, v14

    :goto_3fc
    if-eqz v2, :cond_3ff

    goto :goto_402

    :cond_3ff
    const/4 v2, 0x1

    aget-object v2, v3, v2

    :goto_402
    if-eqz v5, :cond_405

    goto :goto_407

    :cond_405
    aget-object v5, v3, v6

    :goto_407
    if-eqz v11, :cond_40a

    goto :goto_40c

    :cond_40a
    aget-object v11, v3, v13

    :goto_40c
    invoke-virtual {v12, v7, v2, v5, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 43
    :cond_40f
    :goto_40f
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableTint:I

    .line 44
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_443

    .line 45
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_42b

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_42b

    invoke-static {v10, v3}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_42b

    goto :goto_42f

    :cond_42b
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    .line 46
    :goto_42f
    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v4, v8, :cond_43a

    .line 48
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_443

    :cond_43a
    instance-of v5, v2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;

    if-eqz v5, :cond_443

    check-cast v2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;

    invoke-interface {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    .line 49
    :cond_443
    :goto_443
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_drawableTintMode:I

    .line 50
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_468

    const/4 v3, -0x1

    .line 51
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 52
    invoke-static {v2, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v4, v8, :cond_45f

    .line 54
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_468

    :cond_45f
    instance-of v4, v3, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;

    if-eqz v4, :cond_468

    check-cast v3, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;

    invoke-interface {v3, v2}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 55
    :cond_468
    :goto_468
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_firstBaselineToTopHeight:I

    const/4 v3, -0x1

    .line 56
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 57
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_lastBaselineToBottomHeight:I

    .line 58
    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 59
    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->AppCompatTextView_lineHeight:I

    .line 60
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 61
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v2, v3, :cond_485

    .line 62
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->きぬどぼみ〸(Landroid/widget/TextView;I)V

    :cond_485
    if-eq v4, v3, :cond_48c

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-static {v1, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->びちづぼぬ(Landroid/widget/TextView;I)V

    :cond_48c
    if-eq v5, v3, :cond_493

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-static {v1, v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->にぢ〱ぁな(Landroid/widget/TextView;I)V

    :cond_493
    return-void
.end method

.method public final てぜきぽく(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;)V
    .registers 13

    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textStyle:I

    iget v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-virtual {p2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1c

    const/4 v3, 0x2

    const/4 v4, -0x1

    if-lt v0, v2, :cond_23

    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textFontWeight:I

    invoke-virtual {p2, v5, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v5

    iput v5, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    if-eq v5, v4, :cond_23

    iget v5, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    and-int/2addr v5, v3

    or-int/2addr v5, v1

    iput v5, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    :cond_23
    sget v5, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_fontFamily:I

    invoke-virtual {p2, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_56

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v6

    if-eqz v6, :cond_35

    goto :goto_56

    :cond_35
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_typeface:I

    invoke-virtual {p2, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v0

    if-eqz v0, :cond_55

    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->のぷのちつ:Z

    invoke-virtual {p2, p1, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result p1

    if-eq p1, v7, :cond_51

    if-eq p1, v3, :cond_4e

    const/4 p2, 0x3

    if-eq p1, p2, :cond_4b

    goto :goto_55

    :cond_4b
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_53

    :cond_4e
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_53

    :cond_51
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_53
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    :cond_55
    :goto_55
    return-void

    :cond_56
    :goto_56
    const/4 v6, 0x0

    iput-object v6, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v8

    if-eqz v8, :cond_62

    move v5, v6

    :cond_62
    iget v6, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    iget v8, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_a5

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;

    invoke-direct {v9, p0, v6, v8, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;IILjava/lang/ref/WeakReference;)V

    :try_start_78
    iget p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-virtual {p2, v5, p1, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぺぁあねじ(IILづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_9a

    if-lt v0, v2, :cond_98

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    if-eq v0, v4, :cond_98

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    iget v6, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    and-int/2addr v6, v3

    if-eqz v6, :cond_93

    const/4 v6, 0x1

    goto :goto_94

    :cond_93
    const/4 v6, 0x0

    :goto_94
    invoke-static {p1, v0, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_98
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    :cond_9a
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    if-nez p1, :cond_a0

    const/4 p1, 0x1

    goto :goto_a1

    :cond_a0
    const/4 p1, 0x0

    :goto_a1
    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->のぷのちつ:Z
    :try_end_a3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_78 .. :try_end_a3} :catch_a4
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_78 .. :try_end_a3} :catch_a4

    goto :goto_a5

    :catch_a4
    nop

    :cond_a5
    :goto_a5
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    if-nez p1, :cond_d0

    invoke-virtual {p2, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_d0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_c8

    iget p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    if-eq p2, v4, :cond_c8

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺:I

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    and-int/2addr v0, v3

    if-eqz v0, :cond_c3

    const/4 v1, 0x1

    :cond_c3
    invoke-static {p1, p2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_ce

    :cond_c8
    iget p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_ce
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    :cond_d0
    return-void
.end method

.method public なぎぱいぢぎ(Landroid/content/Context;I)V
    .registers 7

    sget-object v0, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance:[I

    .line 1
    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 2
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_textAllCaps:I

    invoke-virtual {v1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1d

    invoke-virtual {v1, p2, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result p2

    .line 3
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 4
    :cond_1d
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-ge p2, v0, :cond_36

    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColor:I

    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_36

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_36
    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textSize:I

    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v3

    if-eqz v3, :cond_4b

    const/4 v3, -0x1

    invoke-virtual {v1, v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v0

    if-nez v0, :cond_4b

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_4b
    invoke-virtual {p0, p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;)V

    const/16 p1, 0x1a

    if-lt p2, p1, :cond_65

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v1, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_65

    invoke-virtual {v1, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_65

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    .line 5
    :cond_65
    iget-object p1, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    if-eqz p1, :cond_75

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_75
    return-void
.end method

.method public びぐびあび()Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ()Z

    move-result v1

    if-eqz v1, :cond_e

    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    return v0
.end method

.method public ぺぁあねじ(I)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ()Z

    move-result v1

    if-eqz v1, :cond_50

    if-eqz p1, :cond_3f

    const/4 v1, 0x1

    if-ne p1, v1, :cond_33

    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v1, 0x41400000    # 12.0f

    const/4 v2, 0x2

    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, p1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぺふねづ〺(FFF)V

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〳ぜぞぜべっ()Z

    move-result p1

    if-eqz p1, :cond_50

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    goto :goto_50

    :cond_33
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown auto-size text type: "

    invoke-static {v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    const/4 p1, 0x0

    .line 2
    iput p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->びぐびあび:F

    iput v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->づざかべべ:F

    iput v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->くし〴〺ぅ:F

    new-array v1, p1, [I

    iput-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ:[I

    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ:Z

    :cond_50
    :goto_50
    return-void
.end method

.method public ぺふねづ〺(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    invoke-direct {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    :cond_b
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->〺つふすそ:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_13

    const/4 p1, 0x1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    :goto_14
    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->くし〴〺ぅ:Z

    .line 1
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    return-void
.end method
