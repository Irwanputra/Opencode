.class public Lcom/google/android/material/chip/Chip;
.super Landroidx/appcompat/widget/AppCompatCheckBox;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ$げつ〴ぬぐ;
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/ぇぬぎばつ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/chip/Chip$〺つふすそ;
    }
.end annotation


# static fields
.field public static final 〻ぞまぎな〻:[I

.field public static final ざっざへづ:I

.field public static final でどあくず:Landroid/graphics/Rect;

.field public static final ぶでにく〼〳:[I


# instance fields
.field public 〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

.field public ぁごぐすすぃ:Landroid/graphics/drawable/RippleDrawable;

.field public いいにぽつ:Z

.field public ぇぬぎばつ:I

.field public final ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

.field public おぐぴう〸ず:I

.field public final ごづごきえ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

.field public final ざとぅぼこ〺:Landroid/graphics/Rect;

.field public づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

.field public のぷのちつ:Z

.field public final は〲ぱなで:Landroid/graphics/RectF;

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_Chip_Action:I

    sput v0, Lcom/google/android/material/chip/Chip;->ざっざへづ:I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lcom/google/android/material/chip/Chip;->でどあくず:Landroid/graphics/Rect;

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a1

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lcom/google/android/material/chip/Chip;->ぶでにく〼〳:[I

    new-array v0, v0, [I

    const v1, 0x101009f

    aput v1, v0, v3

    sput-object v0, Lcom/google/android/material/chip/Chip;->〻ぞまぎな〻:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/chip/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->chipStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/chip/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 21

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v8, p3

    sget v9, Lcom/google/android/material/chip/Chip;->ざっざへづ:I

    move-object/from16 v1, p1

    invoke-static {v1, v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v7, v8}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/chip/Chip;->ざとぅぼこ〺:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/chip/Chip;->は〲ぱなで:Landroid/graphics/RectF;

    new-instance v1, Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;-><init>(Lcom/google/android/material/chip/Chip;)V

    iput-object v1, v0, Lcom/google/android/material/chip/Chip;->ごづごきえ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v10

    const v11, 0x800013

    const/4 v12, 0x1

    if-nez v7, :cond_31

    goto :goto_7f

    :cond_31
    const-string v1, "http://schemas.android.com/apk/res/android"

    const-string v2, "background"

    .line 1
    invoke-interface {v7, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "drawableLeft"

    invoke-interface {v7, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_33f

    const-string v2, "drawableStart"

    invoke-interface {v7, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_337

    const-string v2, "drawableEnd"

    invoke-interface {v7, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Please set end drawable using R.attr#closeIcon."

    if-nez v2, :cond_331

    const-string v2, "drawableRight"

    invoke-interface {v7, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_32b

    const-string v2, "singleLine"

    invoke-interface {v7, v1, v2, v12}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_323

    const-string v2, "lines"

    invoke-interface {v7, v1, v2, v12}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v12, :cond_323

    const-string v2, "minLines"

    invoke-interface {v7, v1, v2, v12}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v12, :cond_323

    const-string v2, "maxLines"

    invoke-interface {v7, v1, v2, v12}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v12, :cond_323

    const-string v2, "gravity"

    invoke-interface {v7, v1, v2, v11}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    .line 2
    :goto_7f
    new-instance v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    invoke-direct {v13, v10, v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 3
    iget-object v1, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget-object v14, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip:[I

    const/4 v15, 0x0

    new-array v6, v15, [I

    move-object/from16 v2, p2

    move-object v3, v14

    move/from16 v4, p3

    move v5, v9

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_shapeAppearance:I

    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    iput-boolean v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->えみにぃほす:Z

    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipSurfaceColor:I

    invoke-static {v2, v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 4
    iget-object v3, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇ〳〲〺すっ:Landroid/content/res/ColorStateList;

    if-eq v3, v2, :cond_b2

    iput-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇ〳〲〺すっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->onStateChange([I)Z

    .line 5
    :cond_b2
    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipBackgroundColor:I

    invoke-static {v2, v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺがぅす〹ち(Landroid/content/res/ColorStateList;)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipMinHeight:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〴ねぷぐくぼ(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipCornerRadius:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_d6

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ(F)V

    :cond_d6
    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipStrokeColor:I

    invoke-static {v2, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ(Landroid/content/res/ColorStateList;)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipStrokeWidth:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ(F)V

    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_rippleColor:I

    invoke-static {v2, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぁないぼぎへ(Landroid/content/res/ColorStateList;)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_android_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->へえどぜせ(Ljava/lang/CharSequence;)V

    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_android_textAppearance:I

    invoke-static {v2, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〺でおいここ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぅばづそほせ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_android_ellipsize:I

    invoke-virtual {v1, v2, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    if-eq v2, v12, :cond_11e

    const/4 v4, 0x2

    if-eq v2, v4, :cond_11b

    const/4 v4, 0x3

    if-eq v2, v4, :cond_118

    goto :goto_122

    :cond_118
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    goto :goto_120

    :cond_11b
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_120

    :cond_11e
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    .line 6
    :goto_120
    iput-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〺えなひあ:Landroid/text/TextUtils$TruncateAt;

    .line 7
    :goto_122
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipIconVisible:I

    invoke-virtual {v1, v2, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺(Z)V

    const-string v2, "http://schemas.android.com/apk/res-auto"

    if-eqz v7, :cond_148

    const-string v4, "chipIconEnabled"

    invoke-interface {v7, v2, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_148

    const-string v4, "chipIconVisible"

    invoke-interface {v7, v2, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_148

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipIconEnabled:I

    invoke-virtual {v1, v4, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺(Z)V

    :cond_148
    iget-object v4, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipIcon:I

    invoke-static {v4, v1, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->じぜこほぱ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱こか〺ぃせ(Landroid/graphics/drawable/Drawable;)V

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipIconTint:I

    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_164

    iget-object v5, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v5, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳(Landroid/content/res/ColorStateList;)V

    :cond_164
    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipIconSize:I

    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くぎぶ〼のそ(F)V

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIconVisible:I

    invoke-virtual {v1, v4, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->にぢ〱ぁな(Z)V

    if-eqz v7, :cond_191

    const-string v4, "closeIconEnabled"

    invoke-interface {v7, v2, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_191

    const-string v4, "closeIconVisible"

    invoke-interface {v7, v2, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_191

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIconEnabled:I

    invoke-virtual {v1, v4, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->にぢ〱ぁな(Z)V

    :cond_191
    iget-object v4, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIcon:I

    invoke-static {v4, v1, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->じぜこほぱ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->な〱ちぉじ(Landroid/graphics/drawable/Drawable;)V

    iget-object v4, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIconTint:I

    invoke-static {v4, v1, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ(Landroid/content/res/ColorStateList;)V

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIconSize:I

    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のびぶけせ(F)V

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_android_checkable:I

    invoke-virtual {v1, v4, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->えがぐせほち(Z)V

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_checkedIconVisible:I

    invoke-virtual {v1, v4, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-virtual {v13, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->こ〲しでおか(Z)V

    if-eqz v7, :cond_1dd

    const-string v4, "checkedIconEnabled"

    invoke-interface {v7, v2, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1dd

    const-string v4, "checkedIconVisible"

    invoke-interface {v7, v2, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1dd

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_checkedIconEnabled:I

    invoke-virtual {v1, v2, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->こ〲しでおか(Z)V

    :cond_1dd
    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_checkedIcon:I

    invoke-static {v2, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->じぜこほぱ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ばおぢでぎか(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_checkedIconTint:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1f9

    iget-object v4, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v4, v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ごまけがぢは(Landroid/content/res/ColorStateList;)V

    :cond_1f9
    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_showMotionSpec:I

    invoke-static {v2, v1, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v2

    .line 8
    iput-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺがぅす〹ち:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    .line 9
    iget-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_hideMotionSpec:I

    invoke-static {v2, v1, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object v2

    .line 10
    iput-object v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    .line 11
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipStartPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->はつきどっ(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_iconStartPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->へぼ〳〻び(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_iconEndPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->しぷげへが(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_textStartPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->がぐくいおす(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_textEndPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->せだてはぺて(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIconStartPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇいうげ〱〹(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_closeIconEndPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->きぬどぼみ〸(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipEndPadding:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {v13, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くねねぱす〻(F)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_android_maxWidth:I

    const v3, 0x7fffffff

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 12
    iput v2, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のかまじえ:I

    .line 13
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-array v5, v15, [I

    .line 14
    invoke-static {v10, v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    move-object v1, v10

    move-object/from16 v2, p2

    move-object v3, v14

    move/from16 v4, p3

    move-object/from16 v16, v5

    move v5, v9

    move v11, v6

    move-object/from16 v6, v16

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {v10, v7, v14, v8, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 15
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_ensureMinTouchTargetSize:I

    invoke-virtual {v1, v2, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v0, Lcom/google/android/material/chip/Chip;->へぬ〴づぞ:Z

    invoke-virtual/range {p0 .. p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v2, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇぬぎばつ(Landroid/content/Context;I)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_chipMinTouchTargetSize:I

    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, v0, Lcom/google/android/material/chip/Chip;->ぇぬぎばつ:I

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 16
    invoke-virtual {v0, v13}, Lcom/google/android/material/chip/Chip;->setChipDrawable(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;)V

    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺふねづ〺(Landroid/view/View;)F

    move-result v1

    invoke-virtual {v13, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->は〲ぱなで(F)V

    new-array v6, v15, [I

    .line 17
    invoke-static {v10, v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    move-object v1, v10

    move-object/from16 v2, p2

    move-object v3, v14

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {v10, v7, v14, v8, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 18
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_2cd

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Chip_android_textColor:I

    invoke-static {v10, v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_2cd
    invoke-virtual {v1, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v1, Lcom/google/android/material/chip/Chip$〺つふすそ;

    invoke-direct {v1, v0, v0}, Lcom/google/android/material/chip/Chip$〺つふすそ;-><init>(Lcom/google/android/material/chip/Chip;Lcom/google/android/material/chip/Chip;)V

    iput-object v1, v0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ()V

    if-nez v3, :cond_2ec

    const/16 v1, 0x15

    if-lt v2, v1, :cond_2ec

    .line 19
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/げつ〴ぬぐ;-><init>(Lcom/google/android/material/chip/Chip;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 20
    :cond_2ec
    iget-boolean v1, v0, Lcom/google/android/material/chip/Chip;->いいにぽつ:Z

    invoke-virtual {v0, v1}, Lcom/google/android/material/chip/Chip;->setChecked(Z)V

    .line 21
    iget-object v1, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉひのべい:Ljava/lang/CharSequence;

    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v1, v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〺えなひあ:Landroid/text/TextUtils$TruncateAt;

    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/material/chip/Chip;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/chip/Chip;->てぜきぽく()V

    iget-object v1, v0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 25
    iget-boolean v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ひぞ〴つき:Z

    if-nez v1, :cond_30a

    .line 26
    invoke-virtual {v0, v12}, Lcom/google/android/material/chip/Chip;->setLines(I)V

    invoke-virtual {v0, v12}, Landroid/widget/CheckBox;->setHorizontallyScrolling(Z)V

    :cond_30a
    const v1, 0x800013

    invoke-virtual {v0, v1}, Lcom/google/android/material/chip/Chip;->setGravity(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/chip/Chip;->ぺふねづ〺()V

    .line 27
    iget-boolean v1, v0, Lcom/google/android/material/chip/Chip;->へぬ〴づぞ:Z

    if-eqz v1, :cond_31c

    .line 28
    iget v1, v0, Lcom/google/android/material/chip/Chip;->ぇぬぎばつ:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setMinHeight(I)V

    :cond_31c
    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Lcom/google/android/material/chip/Chip;->おぐぴう〸ず:I

    return-void

    .line 29
    :cond_323
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Chip does not support multi-line text"

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_32b
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_331
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_337
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Please set start drawable using R.attr#chipIcon."

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_33f
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Please set left drawable using R.attr#chipIcon."

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private getCloseIconTouchBounds()Landroid/graphics/RectF;
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->は〲ぱなで:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->は〲ぱなで:Landroid/graphics/RectF;

    .line 1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->おかぷせ〱(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 2
    :cond_16
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->は〲ぱなで:Landroid/graphics/RectF;

    return-object v0
.end method

.method private getCloseIconTouchBoundsInt()Landroid/graphics/Rect;
    .registers 6

    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->ざとぅぼこ〺:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    float-to-int v2, v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    float-to-int v3, v3

    iget v4, v0, Landroid/graphics/RectF;->right:F

    float-to-int v4, v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v0, v0

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ざとぅぼこ〺:Landroid/graphics/Rect;

    return-object v0
.end method

.method private getTextAppearance()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_9

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 2
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method private setCloseIconHovered(Z)V
    .registers 3

    iget-boolean v0, p0, Lcom/google/android/material/chip/Chip;->てぜきぽく:Z

    if-eq v0, p1, :cond_9

    iput-boolean p1, p0, Lcom/google/android/material/chip/Chip;->てぜきぽく:Z

    invoke-virtual {p0}, Landroid/widget/CheckBox;->refreshDrawableState()V

    :cond_9
    return-void
.end method

.method private setCloseIconPressed(Z)V
    .registers 3

    iget-boolean v0, p0, Lcom/google/android/material/chip/Chip;->ぺふねづ〺:Z

    if-eq v0, p1, :cond_9

    iput-boolean p1, p0, Lcom/google/android/material/chip/Chip;->ぺふねづ〺:Z

    invoke-virtual {p0}, Landroid/widget/CheckBox;->refreshDrawableState()V

    :cond_9
    return-void
.end method

.method public static synthetic 〺つふすそ(Lcom/google/android/material/chip/Chip;)Landroid/graphics/RectF;
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBounds()Landroid/graphics/RectF;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic くし〴〺ぅ(Lcom/google/android/material/chip/Chip;)Landroid/graphics/Rect;
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBoundsInt()Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 1
    const-class v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/16 v2, 0xa

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_43

    :try_start_c
    const-string v1, "\u306e\u3077\u306e\u3061\u3064"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    iget-object v2, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_43

    const-string v1, "\u3073\u3048\u3041\u305c\u3044"

    new-array v5, v3, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v4

    invoke-virtual {v0, v1, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v4

    invoke-virtual {v0, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_41
    .catch Ljava/lang/NoSuchMethodException; {:try_start_c .. :try_end_41} :catch_43
    .catch Ljava/lang/IllegalAccessException; {:try_start_c .. :try_end_41} :catch_43
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_c .. :try_end_41} :catch_43
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_41} :catch_43

    const/4 v0, 0x1

    goto :goto_44

    :catch_43
    :cond_43
    const/4 v0, 0x0

    :goto_44
    if-nez v0, :cond_56

    .line 2
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->へぬ〴づぞ(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_56

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_55

    goto :goto_56

    :cond_55
    const/4 v3, 0x0

    :cond_56
    :goto_56
    return v3
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 11

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/high16 v4, -0x80000000

    if-eq v1, v3, :cond_7b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v5, 0x3d

    const/4 v6, 0x0

    if-eq v1, v5, :cond_65

    const/16 v5, 0x42

    if-eq v1, v5, :cond_4e

    packed-switch v1, :pswitch_data_8a

    goto :goto_7b

    :pswitch_20
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v7

    if-eqz v7, :cond_7b

    const/16 v7, 0x13

    if-eq v1, v7, :cond_38

    const/16 v7, 0x15

    if-eq v1, v7, :cond_35

    const/16 v7, 0x16

    if-eq v1, v7, :cond_3a

    const/16 v5, 0x82

    goto :goto_3a

    :cond_35
    const/16 v5, 0x11

    goto :goto_3a

    :cond_38
    const/16 v5, 0x21

    :cond_3a
    :goto_3a
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    add-int/2addr v1, v3

    const/4 v7, 0x0

    :goto_40
    if-ge v2, v1, :cond_4c

    invoke-virtual {v0, v5, v6}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺(ILandroid/graphics/Rect;)Z

    move-result v8

    if-eqz v8, :cond_4c

    add-int/lit8 v2, v2, 0x1

    const/4 v7, 0x1

    goto :goto_40

    :cond_4c
    move v2, v7

    goto :goto_7b

    :cond_4e
    :pswitch_4e
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v1

    if-eqz v1, :cond_7b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_7b

    .line 2
    iget v1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく:I

    if-eq v1, v4, :cond_63

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2, v6}, Lcom/google/android/material/chip/Chip$〺つふすそ;->ごづごきえ(IILandroid/os/Bundle;)Z

    :cond_63
    const/4 v2, 0x1

    goto :goto_7b

    .line 3
    :cond_65
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v1

    if-eqz v1, :cond_71

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v6}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺(ILandroid/graphics/Rect;)Z

    move-result v2

    goto :goto_7b

    :cond_71
    invoke-virtual {p1, v3}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result v1

    if-eqz v1, :cond_7b

    invoke-virtual {v0, v3, v6}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺(ILandroid/graphics/Rect;)Z

    move-result v2

    :cond_7b
    :goto_7b
    if-eqz v2, :cond_84

    .line 4
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    .line 5
    iget v0, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく:I

    if-eq v0, v4, :cond_84

    return v3

    .line 6
    :cond_84
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_8a
    .packed-switch 0x13
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_4e
    .end packed-switch
.end method

.method public drawableStateChanged()V
    .registers 5

    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->drawableStateChanged()V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    const/4 v1, 0x0

    if-eqz v0, :cond_6e

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->げがぴうあだ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぃぜぶの〸ぃ(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_6e

    .line 2
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 3
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v2

    iget-boolean v3, p0, Lcom/google/android/material/chip/Chip;->のぷのちつ:Z

    if-eqz v3, :cond_1c

    add-int/lit8 v2, v2, 0x1

    :cond_1c
    iget-boolean v3, p0, Lcom/google/android/material/chip/Chip;->てぜきぽく:Z

    if-eqz v3, :cond_22

    add-int/lit8 v2, v2, 0x1

    :cond_22
    iget-boolean v3, p0, Lcom/google/android/material/chip/Chip;->ぺふねづ〺:Z

    if-eqz v3, :cond_28

    add-int/lit8 v2, v2, 0x1

    :cond_28
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_30

    add-int/lit8 v2, v2, 0x1

    :cond_30
    new-array v2, v2, [I

    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_3e

    const v3, 0x101009e

    aput v3, v2, v1

    const/4 v1, 0x1

    :cond_3e
    iget-boolean v3, p0, Lcom/google/android/material/chip/Chip;->のぷのちつ:Z

    if-eqz v3, :cond_49

    const v3, 0x101009c

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    :cond_49
    iget-boolean v3, p0, Lcom/google/android/material/chip/Chip;->てぜきぽく:Z

    if-eqz v3, :cond_54

    const v3, 0x1010367

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    :cond_54
    iget-boolean v3, p0, Lcom/google/android/material/chip/Chip;->ぺふねづ〺:Z

    if-eqz v3, :cond_5f

    const v3, 0x10100a7

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    :cond_5f
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_6a

    const v3, 0x10100a1

    aput v3, v2, v1

    .line 4
    :cond_6a
    invoke-virtual {v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->びちづぼぬ([I)Z

    move-result v1

    :cond_6e
    if-eqz v1, :cond_73

    invoke-virtual {p0}, Landroid/widget/CheckBox;->invalidate()V

    :cond_73
    return-void
.end method

.method public getBackgroundDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    :cond_6
    return-object v0
.end method

.method public getCheckedIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ごまけがぢは:Landroid/graphics/drawable/Drawable;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getCheckedIconTint()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->こ〲しでおか:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getChipBackgroundColor()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->びえぁぜい:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getChipCornerRadius()F
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇとしたべど()F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    :cond_d
    return v1
.end method

.method public getChipDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    return-object v0
.end method

.method public getChipEndPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getChipIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぷぞてのほき:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_d

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〵つてう(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    return-object v0
.end method

.method public getChipIconSize()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->おかぷせ〱:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getChipIconTint()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->けときぜと:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getChipMinHeight()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->なぶひせが:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getChipStartPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くねねぱす〻:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getChipStrokeColor()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぅみぱぎぎ:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getChipStrokeWidth()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->じぜこほぱ:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getChipText()Ljava/lang/CharSequence;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getCloseIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->げがぴうあだ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getCloseIconContentDescription()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ち〴みぎ〻び:Ljava/lang/CharSequence;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getCloseIconEndPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->はつきどっ:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getCloseIconSize()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ておぞぞはね:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getCloseIconStartPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〴ねぷぐくぼ:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getCloseIconTint()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぃぜぶの〸ぃ:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getEllipsize()Landroid/text/TextUtils$TruncateAt;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〺えなひあ:Landroid/text/TextUtils$TruncateAt;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getFocusedRect(Landroid/graphics/Rect;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    .line 1
    iget v1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_10

    .line 2
    iget v0, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺふねづ〺:I

    if-ne v0, v2, :cond_c

    goto :goto_10

    .line 3
    :cond_c
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->getFocusedRect(Landroid/graphics/Rect;)V

    goto :goto_17

    :cond_10
    :goto_10
    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBoundsInt()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    :goto_17
    return-void
.end method

.method public getHideMotionSpec()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getIconEndPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くぎぶ〼のそ:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getIconStartPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱こか〺ぃせ:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getRippleColor()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺづげぺが:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getShapeAppearanceModel()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    return-object v0
.end method

.method public getShowMotionSpec()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺがぅす〹ち:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getTextEndPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getTextStartPadding()F
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳:F

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/CheckBox;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    invoke-static {p0, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅばづそほせ(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;)V

    return-void
.end method

.method public onCreateDrawableState(I)[I
    .registers 3

    add-int/lit8 p1, p1, 0x2

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onCreateDrawableState(I)[I

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v0, Lcom/google/android/material/chip/Chip;->ぶでにく〼〳:[I

    invoke-static {p1, v0}, Landroid/widget/CheckBox;->mergeDrawableStates([I[I)[I

    :cond_11
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_1c

    sget-object v0, Lcom/google/android/material/chip/Chip;->〻ぞまぎな〻:[I

    invoke-static {p1, v0}, Landroid/widget/CheckBox;->mergeDrawableStates([I[I)[I

    :cond_1c
    return-object p1
.end method

.method public onFocusChanged(ZILandroid/graphics/Rect;)V
    .registers 7

    invoke-super {p0, p1, p2, p3}, Landroid/widget/CheckBox;->onFocusChanged(ZILandroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    .line 1
    iget v1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_e

    invoke-virtual {v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺふねづ〺(I)Z

    :cond_e
    if-eqz p1, :cond_13

    invoke-virtual {v0, p2, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺(ILandroid/graphics/Rect;)Z

    :cond_13
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_e

    const/16 v1, 0xa

    if-eq v0, v1, :cond_c

    goto :goto_21

    :cond_c
    const/4 v0, 0x0

    goto :goto_1e

    :cond_e
    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBounds()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v0

    :goto_1e
    invoke-direct {p0, v0}, Lcom/google/android/material/chip/Chip;->setCloseIconHovered(Z)V

    :goto_21
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 12

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {p0}, Landroid/widget/CheckBox;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_16

    :cond_10
    const-string v0, "android.view.View"

    :goto_12
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    goto :goto_22

    :cond_16
    :goto_16
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_1f

    const-string v0, "android.widget.CompoundButton"

    goto :goto_12

    :cond_1f
    const-string v0, "android.widget.Button"

    goto :goto_12

    :goto_22
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    invoke-virtual {p0}, Landroid/widget/CheckBox;->isClickable()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/material/chip/ChipGroup;

    if-eqz v0, :cond_90

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/chip/ChipGroup;

    .line 1
    iget-boolean v1, v0, Lcom/google/android/material/internal/FlowLayout;->びぐびあび:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_64

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 2
    :goto_45
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-ge v1, v4, :cond_61

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v4, v4, Lcom/google/android/material/chip/Chip;

    if-eqz v4, :cond_5e

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/chip/Chip;

    if-ne v4, p0, :cond_5c

    goto :goto_62

    :cond_5c
    add-int/lit8 v3, v3, 0x1

    :cond_5e
    add-int/lit8 v1, v1, 0x1

    goto :goto_45

    :cond_61
    const/4 v3, -0x1

    :goto_62
    move v6, v3

    goto :goto_65

    :cond_64
    const/4 v6, -0x1

    .line 3
    :goto_65
    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->row_index_key:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-nez v1, :cond_71

    const/4 v4, -0x1

    goto :goto_78

    :cond_71
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v4, v2

    :goto_78
    const/4 v5, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 4
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-static/range {v4 .. v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ(IIIIZZ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;

    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_90

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    :cond_90
    return-void
.end method

.method public onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBounds()Landroid/graphics/RectF;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    if-eqz p1, :cond_23

    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_23

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 p2, 0x3ea

    invoke-static {p1, p2}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1

    :cond_23
    const/4 p1, 0x0

    return-object p1
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onRtlPropertiesChanged(I)V

    iget v0, p0, Lcom/google/android/material/chip/Chip;->おぐぴう〸ず:I

    if-eq v0, p1, :cond_c

    iput p1, p0, Lcom/google/android/material/chip/Chip;->おぐぴう〸ず:I

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺふねづ〺()V

    :cond_c
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getCloseIconTouchBounds()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_45

    if-eq v0, v3, :cond_2b

    const/4 v4, 0x2

    if-eq v0, v4, :cond_21

    const/4 v1, 0x3

    if-eq v0, v1, :cond_40

    goto :goto_4c

    :cond_21
    iget-boolean v0, p0, Lcom/google/android/material/chip/Chip;->ぺふねづ〺:Z

    if-eqz v0, :cond_4c

    if-nez v1, :cond_4a

    invoke-direct {p0, v2}, Lcom/google/android/material/chip/Chip;->setCloseIconPressed(Z)V

    goto :goto_4a

    :cond_2b
    iget-boolean v0, p0, Lcom/google/android/material/chip/Chip;->ぺふねづ〺:Z

    if-eqz v0, :cond_40

    .line 1
    invoke-virtual {p0, v2}, Landroid/widget/CheckBox;->playSoundEffect(I)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_39

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_39
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    invoke-virtual {v0, v3, v3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(II)Z

    const/4 v0, 0x1

    goto :goto_41

    :cond_40
    const/4 v0, 0x0

    .line 2
    :goto_41
    invoke-direct {p0, v2}, Lcom/google/android/material/chip/Chip;->setCloseIconPressed(Z)V

    goto :goto_4d

    :cond_45
    if-eqz v1, :cond_4c

    invoke-direct {p0, v3}, Lcom/google/android/material/chip/Chip;->setCloseIconPressed(Z)V

    :cond_4a
    :goto_4a
    const/4 v0, 0x1

    goto :goto_4d

    :cond_4c
    :goto_4c
    const/4 v0, 0x0

    :goto_4d
    if-nez v0, :cond_55

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_56

    :cond_55
    const/4 v2, 0x1

    :cond_56
    return v2
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq p1, v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぁごぐすすぃ:Landroid/graphics/drawable/RippleDrawable;

    if-eq p1, v0, :cond_b

    goto :goto_e

    :cond_b
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_e
    return-void
.end method

.method public setBackgroundColor(I)V
    .registers 2

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq p1, v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぁごぐすすぃ:Landroid/graphics/drawable/RippleDrawable;

    if-eq p1, v0, :cond_b

    goto :goto_e

    :cond_b
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_e
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    return-void
.end method

.method public setCheckable(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->えがぐせほち(Z)V

    :cond_7
    return-void
.end method

.method public setCheckableResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->えがぐせほち(Z)V

    :cond_11
    return-void
.end method

.method public setChecked(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-nez v0, :cond_7

    iput-boolean p1, p0, Lcom/google/android/material/chip/Chip;->いいにぽつ:Z

    goto :goto_1b

    .line 1
    :cond_7
    iget-boolean v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->えがぐせほち:Z

    if-eqz v0, :cond_1b

    .line 2
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    if-eq v0, p1, :cond_1b

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぺぁあねじ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_1b

    invoke-interface {v0, p0, p1}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    :cond_1b
    :goto_1b
    return-void
.end method

.method public setCheckedIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ばおぢでぎか(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    return-void
.end method

.method public setCheckedIconEnabled(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setCheckedIconVisible(Z)V

    return-void
.end method

.method public setCheckedIconEnabledResource(I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setCheckedIconVisible(I)V

    return-void
.end method

.method public setCheckedIconResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ばおぢでぎか(Landroid/graphics/drawable/Drawable;)V

    :cond_d
    return-void
.end method

.method public setCheckedIconTint(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ごまけがぢは(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setCheckedIconTintResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ごまけがぢは(Landroid/content/res/ColorStateList;)V

    :cond_d
    return-void
.end method

.method public setCheckedIconVisible(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->こ〲しでおか(Z)V

    :cond_11
    return-void
.end method

.method public setCheckedIconVisible(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->こ〲しでおか(Z)V

    :cond_7
    return-void
.end method

.method public setChipBackgroundColor(Landroid/content/res/ColorStateList;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->びえぁぜい:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_11

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->onStateChange([I)Z

    :cond_11
    return-void
.end method

.method public setChipBackgroundColorResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺがぅす〹ち(Landroid/content/res/ColorStateList;)V

    :cond_d
    return-void
.end method

.method public setChipCornerRadius(F)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ(F)V

    :cond_7
    return-void
.end method

.method public setChipCornerRadiusResource(I)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ(F)V

    :cond_11
    return-void
.end method

.method public setChipDrawable(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eq v0, p1, :cond_22

    if-eqz v0, :cond_e

    const/4 v1, 0x0

    .line 1
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->いたぷすいだ:Ljava/lang/ref/WeakReference;

    .line 2
    :cond_e
    iput-object p1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ひぞ〴つき:Z

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->いたぷすいだ:Ljava/lang/ref/WeakReference;

    .line 5
    iget p1, p0, Lcom/google/android/material/chip/Chip;->ぇぬぎばつ:I

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->びぐびあび(I)Z

    :cond_22
    return-void
.end method

.method public setChipEndPadding(F)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_12

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_12

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ておぞぞはね()V

    :cond_12
    return-void
.end method

.method public setChipEndPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くねねぱす〻(F)V

    :cond_11
    return-void
.end method

.method public setChipIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱こか〺ぃせ(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    return-void
.end method

.method public setChipIconEnabled(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setChipIconVisible(Z)V

    return-void
.end method

.method public setChipIconEnabledResource(I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setChipIconVisible(I)V

    return-void
.end method

.method public setChipIconResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱こか〺ぃせ(Landroid/graphics/drawable/Drawable;)V

    :cond_d
    return-void
.end method

.method public setChipIconSize(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くぎぶ〼のそ(F)V

    :cond_7
    return-void
.end method

.method public setChipIconSizeResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くぎぶ〼のそ(F)V

    :cond_11
    return-void
.end method

.method public setChipIconTint(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setChipIconTintResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳(Landroid/content/res/ColorStateList;)V

    :cond_d
    return-void
.end method

.method public setChipIconVisible(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺(Z)V

    :cond_11
    return-void
.end method

.method public setChipIconVisible(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺(Z)V

    :cond_7
    return-void
.end method

.method public setChipMinHeight(F)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_12

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->なぶひせが:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_12

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->なぶひせが:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ておぞぞはね()V

    :cond_12
    return-void
.end method

.method public setChipMinHeightResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〴ねぷぐくぼ(F)V

    :cond_11
    return-void
.end method

.method public setChipStartPadding(F)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_12

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くねねぱす〻:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_12

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くねねぱす〻:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ておぞぞはね()V

    :cond_12
    return-void
.end method

.method public setChipStartPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->はつきどっ(F)V

    :cond_11
    return-void
.end method

.method public setChipStrokeColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setChipStrokeColorResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ(Landroid/content/res/ColorStateList;)V

    :cond_d
    return-void
.end method

.method public setChipStrokeWidth(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ(F)V

    :cond_7
    return-void
.end method

.method public setChipStrokeWidthResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ(F)V

    :cond_11
    return-void
.end method

.method public setChipText(Ljava/lang/CharSequence;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setChipTextResource(I)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCloseIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->な〱ちぉじ(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ()V

    return-void
.end method

.method public setCloseIconContentDescription(Ljava/lang/CharSequence;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_18

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ち〴みぎ〻び:Ljava/lang/CharSequence;

    if-eq v1, p1, :cond_18

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ()Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    move-result-object v1

    .line 2
    iget-object v2, v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    const/4 v3, 0x1

    invoke-virtual {v1, p1, v2, v3}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->びぐびあび(Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;Z)Ljava/lang/CharSequence;

    move-result-object p1

    .line 3
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ち〴みぎ〻び:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    :cond_18
    return-void
.end method

.method public setCloseIconEnabled(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setCloseIconVisible(Z)V

    return-void
.end method

.method public setCloseIconEnabledResource(I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setCloseIconVisible(I)V

    return-void
.end method

.method public setCloseIconEndPadding(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->きぬどぼみ〸(F)V

    :cond_7
    return-void
.end method

.method public setCloseIconEndPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->きぬどぼみ〸(F)V

    :cond_11
    return-void
.end method

.method public setCloseIconResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->な〱ちぉじ(Landroid/graphics/drawable/Drawable;)V

    .line 2
    :cond_d
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ()V

    return-void
.end method

.method public setCloseIconSize(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のびぶけせ(F)V

    :cond_7
    return-void
.end method

.method public setCloseIconSizeResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のびぶけせ(F)V

    :cond_11
    return-void
.end method

.method public setCloseIconStartPadding(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇいうげ〱〹(F)V

    :cond_7
    return-void
.end method

.method public setCloseIconStartPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇいうげ〱〹(F)V

    :cond_11
    return-void
.end method

.method public setCloseIconTint(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setCloseIconTintResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_d

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ(Landroid/content/res/ColorStateList;)V

    :cond_d
    return-void
.end method

.method public setCloseIconVisible(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->setCloseIconVisible(Z)V

    return-void
.end method

.method public setCloseIconVisible(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->にぢ〱ぁな(Z)V

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ()V

    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    if-nez p1, :cond_10

    if-nez p3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set end drawable using R.attr#closeIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set start drawable using R.attr#chipIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    if-nez p1, :cond_10

    if-nez p3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set end drawable using R.attr#closeIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set start drawable using R.attr#chipIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .registers 5

    if-nez p1, :cond_10

    if-nez p3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set end drawable using R.attr#closeIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set start drawable using R.attr#chipIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    if-nez p1, :cond_10

    if-nez p3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set end drawable using R.attr#closeIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set start drawable using R.attr#chipIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .registers 5

    if-nez p1, :cond_10

    if-nez p3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set end drawable using R.attr#closeIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set start drawable using R.attr#chipIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    if-nez p1, :cond_10

    if-nez p3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set right drawable using R.attr#closeIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Please set left drawable using R.attr#chipIcon."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setElevation(F)V
    .registers 5

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setElevation(F)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_14

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->おぐぴう〸ず:F

    cmpl-float v2, v2, p1

    if-eqz v2, :cond_14

    iput p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->おぐぴう〸ず:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    :cond_14
    return-void
.end method

.method public setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    if-eq p1, v0, :cond_13

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_12

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〺えなひあ:Landroid/text/TextUtils$TruncateAt;

    :cond_12
    return-void

    .line 2
    :cond_13
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Text within a chip are not allowed to scroll."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEnsureMinTouchTargetSize(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/material/chip/Chip;->へぬ〴づぞ:Z

    iget p1, p0, Lcom/google/android/material/chip/Chip;->ぇぬぎばつ:I

    invoke-virtual {p0, p1}, Lcom/google/android/material/chip/Chip;->びぐびあび(I)Z

    return-void
.end method

.method public setGravity(I)V
    .registers 3

    const v0, 0x800013

    if-eq p1, v0, :cond_6

    goto :goto_9

    :cond_6
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setGravity(I)V

    :goto_9
    return-void
.end method

.method public setHideMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_6

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    :cond_6
    return-void
.end method

.method public setHideMotionSpecResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_c

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    .line 2
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のね〱ばぁぢ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    :cond_c
    return-void
.end method

.method public setIconEndPadding(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->しぷげへが(F)V

    :cond_7
    return-void
.end method

.method public setIconEndPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->しぷげへが(F)V

    :cond_11
    return-void
.end method

.method public setIconStartPadding(F)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->へぼ〳〻び(F)V

    :cond_7
    return-void
.end method

.method public setIconStartPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->へぼ〳〻び(F)V

    :cond_11
    return-void
.end method

.method public setLayoutDirection(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_e

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setLayoutDirection(I)V

    :cond_e
    return-void
.end method

.method public setLines(I)V
    .registers 3

    const/4 v0, 0x1

    if-gt p1, v0, :cond_7

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setLines(I)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Chip does not support multi-line text"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMaxLines(I)V
    .registers 3

    const/4 v0, 0x1

    if-gt p1, v0, :cond_7

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setMaxLines(I)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Chip does not support multi-line text"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMaxWidth(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setMaxWidth(I)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_9

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->のかまじえ:I

    :cond_9
    return-void
.end method

.method public setMinLines(I)V
    .registers 3

    const/4 v0, 0x1

    if-gt p1, v0, :cond_7

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setMinLines(I)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Chip does not support multi-line text"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOnCheckedChangeListenerInternal(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/chip/Chip;->ぺぁあねじ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public setOnCloseIconClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ()V

    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぁないぼぎへ(Landroid/content/res/ColorStateList;)V

    :cond_7
    iget-object p1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 1
    iget-boolean p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぁにあがあ:Z

    if-nez p1, :cond_10

    .line 2
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->いいにぽつ()V

    :cond_10
    return-void
.end method

.method public setRippleColorResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_16

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぁないぼぎへ(Landroid/content/res/ColorStateList;)V

    .line 2
    iget-object p1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 3
    iget-boolean p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぁにあがあ:Z

    if-nez p1, :cond_16

    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->いいにぽつ()V

    :cond_16
    return-void
.end method

.method public setShapeAppearanceModel(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iput-object p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    return-void
.end method

.method public setShowMotionSpec(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_6

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺがぅす〹ち:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    :cond_6
    return-void
.end method

.method public setShowMotionSpecResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_c

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-static {v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    .line 2
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺがぅす〹ち:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    :cond_c
    return-void
.end method

.method public setSingleLine(Z)V
    .registers 3

    if-eqz p1, :cond_6

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setSingleLine(Z)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Chip does not support multi-line text"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    if-nez p1, :cond_9

    const-string p1, ""

    .line 1
    :cond_9
    iget-boolean v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ひぞ〴つき:Z

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    goto :goto_10

    :cond_f
    move-object v0, p1

    .line 2
    :goto_10
    invoke-super {p0, v0, p2}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iget-object p2, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz p2, :cond_1a

    invoke-virtual {p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->へえどぜせ(Ljava/lang/CharSequence;)V

    :cond_1a
    return-void
.end method

.method public setTextAppearance(I)V
    .registers 5

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setTextAppearance(I)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_15

    .line 1
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    iget-object v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;-><init>(Landroid/content/Context;I)V

    .line 2
    iget-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {p1, v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;Landroid/content/Context;)V

    .line 3
    :cond_15
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->てぜきぽく()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 5

    invoke-super {p0, p1, p2}, Landroid/widget/CheckBox;->setTextAppearance(Landroid/content/Context;I)V

    iget-object p1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz p1, :cond_15

    .line 4
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    iget-object v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;-><init>(Landroid/content/Context;I)V

    .line 5
    iget-object p2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;Landroid/content/Context;)V

    .line 6
    :cond_15
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->てぜきぽく()V

    return-void
.end method

.method public setTextAppearance(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_b

    .line 7
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉねぞはがぞ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1, p1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;Landroid/content/Context;)V

    .line 8
    :cond_b
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->てぜきぽく()V

    return-void
.end method

.method public setTextAppearanceResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/material/chip/Chip;->setTextAppearance(Landroid/content/Context;I)V

    return-void
.end method

.method public setTextEndPadding(F)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_12

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_12

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ておぞぞはね()V

    :cond_12
    return-void
.end method

.method public setTextEndPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->せだてはぺて(F)V

    :cond_11
    return-void
.end method

.method public setTextStartPadding(F)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_12

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_12

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ておぞぞはね()V

    :cond_12
    return-void
.end method

.method public setTextStartPaddingResource(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぎきぁ〱ぢ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->がぐくいおす(F)V

    :cond_11
    return-void
.end method

.method public final 〳ぜぞぜべっ()V
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_10

    .line 2
    iget-boolean v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇとしたべど:Z

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_1a

    .line 3
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    goto :goto_1b

    :cond_1a
    const/4 v0, 0x0

    :goto_1b
    invoke-static {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V

    return-void
.end method

.method public final ぁごぐすすぃ()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    if-eqz v0, :cond_16

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/CheckBox;->setMinWidth(I)V

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->getChipMinHeight()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/CheckBox;->setMinHeight(I)V

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺぁあねじ()V

    :cond_16
    return-void
.end method

.method public final いいにぽつ()V
    .registers 5

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 1
    iget-object v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぺづげぺが:Landroid/content/res/ColorStateList;

    .line 2
    invoke-static {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->くし〴〺ぅ(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/google/android/material/chip/Chip;->ぁごぐすすぃ:Landroid/graphics/drawable/RippleDrawable;

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->しげにけぃ(Z)V

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->ぁごぐすすぃ:Landroid/graphics/drawable/RippleDrawable;

    .line 3
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_28

    invoke-virtual {p0, v0}, Lcom/google/android/material/chip/Chip;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2b

    :cond_28
    invoke-virtual {p0, v0}, Lcom/google/android/material/chip/Chip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    :goto_2b
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺふねづ〺()V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    iget v0, p0, Lcom/google/android/material/chip/Chip;->ぇぬぎばつ:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/chip/Chip;->びぐびあび(I)Z

    invoke-virtual {p0}, Landroid/widget/CheckBox;->requestLayout()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_11

    invoke-virtual {p0}, Landroid/widget/CheckBox;->invalidateOutline()V

    :cond_11
    return-void
.end method

.method public final づざかべべ()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->げがぴうあだ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method

.method public final てぜきぽく()V
    .registers 5

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    iput-object v1, v0, Landroid/text/TextPaint;->drawableState:[I

    :cond_e
    invoke-direct {p0}, Lcom/google/android/material/chip/Chip;->getTextAppearance()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    move-result-object v1

    if-eqz v1, :cond_1d

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/material/chip/Chip;->ごづごきえ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

    invoke-virtual {v1, v2, v0, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->くし〴〺ぅ(Landroid/content/Context;Landroid/text/TextPaint;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;)V

    :cond_1d
    return-void
.end method

.method public なぎぱいぢぎ()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz v0, :cond_a

    .line 1
    iget-boolean v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->えがぐせほち:Z

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public びぐびあび(I)Z
    .registers 11

    iput p1, p0, Lcom/google/android/material/chip/Chip;->ぇぬぎばつ:I

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/chip/Chip;->へぬ〴づぞ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_13

    .line 2
    iget-object p1, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぁごぐすすぃ()V

    goto :goto_12

    :cond_f
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺぁあねじ()V

    :goto_12
    return v1

    :cond_13
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 3
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->なぶひせが:F

    float-to-int v0, v0

    sub-int v0, p1, v0

    .line 4
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    invoke-virtual {v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->getIntrinsicWidth()I

    move-result v2

    sub-int v2, p1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-gtz v2, :cond_3a

    if-gtz v0, :cond_3a

    iget-object p1, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    if-eqz p1, :cond_36

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぁごぐすすぃ()V

    goto :goto_39

    :cond_36
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺぁあねじ()V

    :goto_39
    return v1

    :cond_3a
    if-lez v2, :cond_40

    div-int/lit8 v2, v2, 0x2

    move v7, v2

    goto :goto_41

    :cond_40
    const/4 v7, 0x0

    :goto_41
    if-lez v0, :cond_47

    div-int/lit8 v1, v0, 0x2

    move v8, v1

    goto :goto_48

    :cond_47
    const/4 v8, 0x0

    :goto_48
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_6b

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v2, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/InsetDrawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v2, v0, Landroid/graphics/Rect;->top:I

    if-ne v2, v8, :cond_6b

    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    if-ne v2, v8, :cond_6b

    iget v2, v0, Landroid/graphics/Rect;->left:I

    if-ne v2, v7, :cond_6b

    iget v0, v0, Landroid/graphics/Rect;->right:I

    if-ne v0, v7, :cond_6b

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺぁあねじ()V

    return v1

    :cond_6b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v0, v2, :cond_81

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getMinHeight()I

    move-result v0

    if-eq v0, p1, :cond_7a

    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setMinHeight(I)V

    :cond_7a
    invoke-virtual {p0}, Landroid/widget/CheckBox;->getMinWidth()I

    move-result v0

    if-eq v0, p1, :cond_87

    goto :goto_84

    :cond_81
    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setMinHeight(I)V

    :goto_84
    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setMinWidth(I)V

    .line 5
    :cond_87
    new-instance p1, Landroid/graphics/drawable/InsetDrawable;

    iget-object v4, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    move-object v3, p1

    move v5, v7

    move v6, v8

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    iput-object p1, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺぁあねじ()V

    return v1
.end method

.method public final ぺぁあねじ()V
    .registers 4

    sget-boolean v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->いいにぽつ()V

    goto :goto_3b

    :cond_8
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->しげにけぃ(Z)V

    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_1e

    invoke-virtual {p0, v0}, Lcom/google/android/material/chip/Chip;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_21

    :cond_1e
    invoke-virtual {p0, v0}, Lcom/google/android/material/chip/Chip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    :goto_21
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->ぺふねづ〺()V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/chip/Chip;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    if-ne v0, v1, :cond_3b

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-nez v0, :cond_3b

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_3b
    :goto_3b
    return-void
.end method

.method public final ぺふねづ〺()V
    .registers 7

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_52

    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-nez v0, :cond_f

    goto :goto_52

    .line 1
    :cond_f
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〱かけばぜぐ:F

    .line 2
    iget v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->かづげぃぁ〺:F

    add-float/2addr v1, v2

    .line 3
    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->〺でおいここ()F

    move-result v0

    add-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 4
    iget v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->くねねぱす〻:F

    .line 5
    iget v3, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ずまげせび〳:F

    add-float/2addr v2, v3

    .line 6
    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぷぞてのほき()F

    move-result v1

    add-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    if-eqz v2, :cond_3b

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iget-object v3, p0, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ:Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v3, v2}, Landroid/graphics/drawable/InsetDrawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v3, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v3

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v2

    :cond_3b
    invoke-virtual {p0}, Landroid/widget/CheckBox;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getPaddingBottom()I

    move-result v3

    .line 7
    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x11

    if-lt v4, v5, :cond_4f

    invoke-virtual {p0, v1, v2, v0, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_52

    :cond_4f
    invoke-virtual {p0, v1, v2, v0, v3}, Landroid/view/View;->setPadding(IIII)V

    :cond_52
    :goto_52
    return-void
.end method
