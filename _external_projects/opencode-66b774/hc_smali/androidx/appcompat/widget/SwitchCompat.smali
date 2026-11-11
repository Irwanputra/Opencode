.class public Landroidx/appcompat/widget/SwitchCompat;
.super Landroid/widget/CompoundButton;
.source ""


# static fields
.field public static final ぃぜぶの〸ぃ:[I

.field public static final ながふずは:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/appcompat/widget/SwitchCompat;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

.field public 〺つふすそ:Landroid/graphics/drawable/Drawable;

.field public 〺でおいここ:Landroid/animation/ObjectAnimator;

.field public 〻ぞまぎな〻:I

.field public ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

.field public いいにぽつ:Z

.field public ぅみぱぎぎ:I

.field public ぇ〳〲〺すっ:I

.field public final ぇとしたべど:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

.field public ぇぬぎばつ:Ljava/lang/CharSequence;

.field public ぉ〲なぱぽた:F

.field public ぉざぅち〻:Ljava/lang/CharSequence;

.field public final ぉひのべい:Landroid/text/TextPaint;

.field public おかぷせ〱:Landroid/text/method/TransformationMethod;

.field public おぐぴう〸ず:Z

.field public くし〴〺ぅ:Landroid/content/res/ColorStateList;

.field public けときぜと:Landroid/text/Layout;

.field public final げがぴうあだ:Landroid/graphics/Rect;

.field public ごづごきえ:I

.field public ざっざへづ:F

.field public ざとぅぼこ〺:Z

.field public じぜこほぱ:I

.field public せづっ〸ちね:Landroid/content/res/ColorStateList;

.field public づざかべべ:Z

.field public てぜきぽく:I

.field public でどあくず:F

.field public どぇぞほだ:I

.field public なぎぱいぢぎ:Z

.field public なぶひせが:I

.field public のぷのちつ:I

.field public は〲ぱなで:I

.field public びえぁぜい:I

.field public びぐびあび:Landroid/graphics/PorterDuff$Mode;

.field public ぶでにく〼〳:Landroid/view/VelocityTracker;

.field public ぷぞてのほき:Landroid/text/Layout;

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

.field public ぺづげぺが:I

.field public ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/SwitchCompat$げつ〴ぬぐ;

    const-class v1, Ljava/lang/Float;

    const-string v2, "thumbPos"

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/SwitchCompat$げつ〴ぬぐ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/appcompat/widget/SwitchCompat;->ながふずは:Landroid/util/Property;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100a0

    aput v2, v0, v1

    sput-object v0, Landroidx/appcompat/widget/SwitchCompat;->ぃぜぶの〸ぃ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->switchStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 16

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->づざかべべ:Z

    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->なぎぱいぢぎ:Z

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->いいにぽつ:Z

    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺふねづ〺:Z

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぶでにく〼〳:Landroid/view/VelocityTracker;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {p0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    new-instance v2, Landroid/text/TextPaint;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    iput v4, v2, Landroid/text/TextPaint;->density:F

    sget-object v7, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat:[I

    .line 1
    new-instance v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    invoke-virtual {p1, p2, v7, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    invoke-direct {v2, p1, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/4 v11, 0x0

    move-object v5, p0

    move-object v6, p1

    move-object v8, p2

    move v10, p3

    .line 2
    invoke-static/range {v5 .. v11}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_android_thumb:I

    invoke-virtual {v2, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_5d

    invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_5d
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_track:I

    invoke-virtual {v2, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_6a

    invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_6a
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_android_textOn:I

    invoke-virtual {v2, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇぬぎばつ:Ljava/lang/CharSequence;

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_android_textOff:I

    invoke-virtual {v2, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉざぅち〻:Ljava/lang/CharSequence;

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_showText:I

    invoke-virtual {v2, v4, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v4

    iput-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ざとぅぼこ〺:Z

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_thumbTextPadding:I

    invoke-virtual {v2, v4, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v4

    iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->てぜきぽく:I

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_switchMinWidth:I

    invoke-virtual {v2, v4, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v4

    iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->のぷのちつ:I

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_switchPadding:I

    invoke-virtual {v2, v4, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v4

    iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->へぬ〴づぞ:I

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_splitTrack:I

    invoke-virtual {v2, v4, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v4

    iput-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->おぐぴう〸ず:Z

    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_thumbTint:I

    invoke-virtual {v2, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_ae

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->づざかべべ:Z

    :cond_ae
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_thumbTintMode:I

    const/4 v5, -0x1

    invoke-virtual {v2, v4, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v4

    invoke-static {v4, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v4

    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    if-eq v6, v4, :cond_c1

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->なぎぱいぢぎ:Z

    :cond_c1
    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->づざかべべ:Z

    if-nez v4, :cond_c9

    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->なぎぱいぢぎ:Z

    if-eqz v4, :cond_cc

    :cond_c9
    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->げつ〴ぬぐ()V

    :cond_cc
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_trackTint:I

    invoke-virtual {v2, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_d8

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->いいにぽつ:Z

    :cond_d8
    sget v4, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_trackTintMode:I

    invoke-virtual {v2, v4, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v4

    invoke-static {v4, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    if-eq v4, v0, :cond_ea

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺふねづ〺:Z

    :cond_ea
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->いいにぽつ:Z

    if-nez v0, :cond_f2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺふねづ〺:Z

    if-eqz v0, :cond_f5

    :cond_f2
    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ()V

    :cond_f5
    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->SwitchCompat_switchTextAppearance:I

    invoke-virtual {v2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v0

    if-eqz v0, :cond_100

    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTextAppearance(Landroid/content/Context;I)V

    :cond_100
    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇとしたべど:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {v0, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ(Landroid/util/AttributeSet;I)V

    .line 3
    iget-object p2, v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/SwitchCompat;->ごづごきえ:I

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〻ぞまぎな〻:I

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->refreshDrawableState()V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method

.method private getTargetCheckedState()Z
    .registers 3

    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉ〲なぱぽた:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method private getThumbOffset()I
    .registers 3

    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉ〲なぱぽた:F

    sub-float/2addr v0, v1

    goto :goto_e

    :cond_c
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉ〲なぱぽた:F

    :goto_e
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbScrollRange()I

    move-result v1

    int-to-float v1, v1

    mul-float v0, v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private getThumbScrollRange()I
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_26

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    invoke-static {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_14

    :cond_12
    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ:Landroid/graphics/Rect;

    :goto_14
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇ〳〲〺すっ:I

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->なぶひせが:I

    sub-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v1

    iget v1, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v0

    return v2

    :cond_26
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 12

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->どぇぞほだ:I

    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぅみぱぎぎ:I

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->じぜこほぱ:I

    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺづげぺが:I

    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbOffset()I

    move-result v5

    add-int/2addr v5, v1

    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_18

    invoke-static {v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v6

    goto :goto_1a

    :cond_18
    sget-object v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ:Landroid/graphics/Rect;

    :goto_1a
    iget-object v7, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_4f

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v7, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v7

    if-eqz v6, :cond_48

    iget v8, v6, Landroid/graphics/Rect;->left:I

    if-le v8, v7, :cond_2c

    sub-int/2addr v8, v7

    add-int/2addr v1, v8

    :cond_2c
    iget v7, v6, Landroid/graphics/Rect;->top:I

    iget v8, v0, Landroid/graphics/Rect;->top:I

    if-le v7, v8, :cond_35

    sub-int/2addr v7, v8

    add-int/2addr v7, v2

    goto :goto_36

    :cond_35
    move v7, v2

    :goto_36
    iget v8, v6, Landroid/graphics/Rect;->right:I

    iget v9, v0, Landroid/graphics/Rect;->right:I

    if-le v8, v9, :cond_3e

    sub-int/2addr v8, v9

    sub-int/2addr v3, v8

    :cond_3e
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    iget v8, v0, Landroid/graphics/Rect;->bottom:I

    if-le v6, v8, :cond_49

    sub-int/2addr v6, v8

    sub-int v6, v4, v6

    goto :goto_4a

    :cond_48
    move v7, v2

    :cond_49
    move v6, v4

    :goto_4a
    iget-object v8, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v8, v1, v7, v3, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_4f
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_6e

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v1, v0, Landroid/graphics/Rect;->left:I

    sub-int v1, v5, v1

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->なぶひせが:I

    add-int/2addr v5, v3

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, v0

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_6e

    invoke-static {v0, v1, v2, v5, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぇいうげ〱〹(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_6e
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public drawableHotspotChanged(FF)V
    .registers 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->drawableHotspotChanged(FF)V

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_10

    invoke-static {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    :cond_10
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_17

    invoke-static {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    :cond_17
    return-void
.end method

.method public drawableStateChanged()V
    .registers 5

    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    or-int/2addr v2, v1

    :cond_17
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_26

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_26

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v2, v0

    :cond_26
    if-eqz v2, :cond_2b

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    :cond_2b
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .registers 3

    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I

    move-result v0

    return v0

    :cond_b
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇ〳〲〺すっ:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->へぬ〴づぞ:I

    add-int/2addr v0, v1

    :cond_1f
    return v0
.end method

.method public getCompoundPaddingRight()I
    .registers 3

    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I

    move-result v0

    return v0

    :cond_b
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇ〳〲〺すっ:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->へぬ〴づぞ:I

    add-int/2addr v0, v1

    :cond_1f
    return v0
.end method

.method public getShowText()Z
    .registers 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ざとぅぼこ〺:Z

    return v0
.end method

.method public getSplitTrack()Z
    .registers 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->おぐぴう〸ず:Z

    return v0
.end method

.method public getSwitchMinWidth()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->のぷのちつ:I

    return v0
.end method

.method public getSwitchPadding()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->へぬ〴づぞ:I

    return v0
.end method

.method public getTextOff()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉざぅち〻:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTextOn()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇぬぎばつ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getThumbDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getThumbTextPadding()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->てぜきぽく:I

    return v0
.end method

.method public getThumbTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getThumbTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getTrackDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getTrackTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getTrackTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public jumpDrawablesToCurrentState()V
    .registers 2

    invoke-super {p0}, Landroid/widget/CompoundButton;->jumpDrawablesToCurrentState()V

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->end()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    :cond_23
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .registers 3

    add-int/lit8 p1, p1, 0x1

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onCreateDrawableState(I)[I

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v0, Landroidx/appcompat/widget/SwitchCompat;->ぃぜぶの〸ぃ:[I

    invoke-static {p1, v0}, Landroid/widget/CompoundButton;->mergeDrawableStates([I[I)[I

    :cond_11
    return-object p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 11

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_d

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    goto :goto_10

    :cond_d
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :goto_10
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぅみぱぎぎ:I

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺづげぺが:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v3, v4

    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_4c

    iget-boolean v5, p0, Landroidx/appcompat/widget/SwitchCompat;->おぐぴう〸ず:Z

    if-eqz v5, :cond_49

    if-eqz v4, :cond_49

    invoke-static {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    iget v6, v0, Landroid/graphics/Rect;->left:I

    iget v7, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    iput v6, v0, Landroid/graphics/Rect;->left:I

    iget v6, v0, Landroid/graphics/Rect;->right:I

    iget v5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v6, v5

    iput v6, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    sget-object v6, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v6}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_4c

    :cond_49
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_4c
    :goto_4c
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    if-eqz v4, :cond_55

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_55
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getTargetCheckedState()Z

    move-result v1

    if-eqz v1, :cond_5e

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぷぞてのほき:Landroid/text/Layout;

    goto :goto_60

    :cond_5e
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->けときぜと:Landroid/text/Layout;

    :goto_60
    if-eqz v1, :cond_a3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v5

    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->せづっ〸ちね:Landroid/content/res/ColorStateList;

    if-eqz v6, :cond_74

    iget-object v7, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    const/4 v8, 0x0

    invoke-virtual {v6, v5, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v6

    invoke-virtual {v7, v6}, Landroid/text/TextPaint;->setColor(I)V

    :cond_74
    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    iput-object v5, v6, Landroid/text/TextPaint;->drawableState:[I

    if-eqz v4, :cond_84

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    iget v5, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, v4

    goto :goto_88

    :cond_84
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getWidth()I

    move-result v5

    :goto_88
    div-int/lit8 v5, v5, 0x2

    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v5, v4

    add-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    int-to-float v3, v5

    int-to-float v2, v2

    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v1, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    :cond_a3
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "android.widget.Switch"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 5

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-string v0, "android.widget.Switch"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇぬぎばつ:Ljava/lang/CharSequence;

    goto :goto_13

    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉざぅち〻:Ljava/lang/CharSequence;

    :goto_13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3a

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3a

    :cond_27
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    :cond_3a
    :goto_3a
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 7

    invoke-super/range {p0 .. p5}, Landroid/widget/CompoundButton;->onLayout(ZIIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    const/4 p2, 0x0

    if-eqz p1, :cond_2e

    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz p3, :cond_12

    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    goto :goto_15

    :cond_12
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    :goto_15
    iget-object p3, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-static {p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object p3

    iget p4, p3, Landroid/graphics/Rect;->left:I

    iget p5, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr p4, p5

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iget p3, p3, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    goto :goto_2f

    :cond_2e
    const/4 p4, 0x0

    :goto_2f
    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_40

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result p1

    add-int/2addr p1, p4

    iget p3, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇ〳〲〺すっ:I

    add-int/2addr p3, p1

    sub-int/2addr p3, p4

    sub-int/2addr p3, p2

    goto :goto_51

    :cond_40
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingRight()I

    move-result p3

    sub-int/2addr p1, p3

    sub-int p3, p1, p2

    iget p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇ〳〲〺すっ:I

    sub-int p1, p3, p1

    add-int/2addr p1, p4

    add-int/2addr p1, p2

    :goto_51
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getGravity()I

    move-result p2

    and-int/lit8 p2, p2, 0x70

    const/16 p4, 0x10

    if-eq p2, p4, :cond_76

    const/16 p4, 0x50

    if-eq p2, p4, :cond_67

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result p2

    iget p4, p0, Landroidx/appcompat/widget/SwitchCompat;->びえぁぜい:I

    add-int/2addr p4, p2

    goto :goto_8f

    :cond_67
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result p4

    sub-int p4, p2, p4

    iget p2, p0, Landroidx/appcompat/widget/SwitchCompat;->びえぁぜい:I

    sub-int p2, p4, p2

    goto :goto_8f

    :cond_76
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getHeight()I

    move-result p4

    add-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p4, p2

    div-int/lit8 p4, p4, 0x2

    iget p2, p0, Landroidx/appcompat/widget/SwitchCompat;->びえぁぜい:I

    div-int/lit8 p5, p2, 0x2

    sub-int/2addr p4, p5

    add-int/2addr p2, p4

    move v0, p4

    move p4, p2

    move p2, v0

    :goto_8f
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->どぇぞほだ:I

    iput p2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぅみぱぎぎ:I

    iput p4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺづげぺが:I

    iput p3, p0, Landroidx/appcompat/widget/SwitchCompat;->じぜこほぱ:I

    return-void
.end method

.method public onMeasure(II)V
    .registers 9

    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ざとぅぼこ〺:Z

    if-eqz v0, :cond_1c

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぷぞてのほき:Landroid/text/Layout;

    if-nez v0, :cond_10

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇぬぎばつ:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ(Ljava/lang/CharSequence;)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぷぞてのほき:Landroid/text/Layout;

    :cond_10
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->けときぜと:Landroid/text/Layout;

    if-nez v0, :cond_1c

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉざぅち〻:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ(Ljava/lang/CharSequence;)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->けときぜと:Landroid/text/Layout;

    :cond_1c
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_39

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iget v3, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v3

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v3

    iget-object v3, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    goto :goto_3b

    :cond_39
    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_3b
    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ざとぅぼこ〺:Z

    if-eqz v4, :cond_55

    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ぷぞてのほき:Landroid/text/Layout;

    invoke-virtual {v4}, Landroid/text/Layout;->getWidth()I

    move-result v4

    iget-object v5, p0, Landroidx/appcompat/widget/SwitchCompat;->けときぜと:Landroid/text/Layout;

    invoke-virtual {v5}, Landroid/text/Layout;->getWidth()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->てぜきぽく:I

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v4

    goto :goto_56

    :cond_55
    const/4 v5, 0x0

    :goto_56
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->なぶひせが:I

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_6a

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    goto :goto_6d

    :cond_6a
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :goto_6d
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_85

    invoke-static {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v4

    iget v5, v4, Landroid/graphics/Rect;->left:I

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v4, v4, Landroid/graphics/Rect;->right:I

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_85
    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->のぷのちつ:I

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->なぶひせが:I

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v1

    add-int/2addr v5, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇ〳〲〺すっ:I

    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->びえぁぜい:I

    invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getMeasuredHeight()I

    move-result p1

    if-ge p1, v1, :cond_a9

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getMeasuredWidthAndState()I

    move-result p1

    invoke-virtual {p0, p1, v1}, Landroid/widget/CompoundButton;->setMeasuredDimension(II)V

    :cond_a9
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇぬぎばつ:Ljava/lang/CharSequence;

    goto :goto_e

    :cond_c
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉざぅち〻:Ljava/lang/CharSequence;

    :goto_e
    if-eqz v0, :cond_17

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 12

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぶでにく〼〳:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_100

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v0, v2, :cond_93

    if-eq v0, v5, :cond_18

    if-eq v0, v3, :cond_93

    goto/16 :goto_153

    :cond_18
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->は〲ぱなで:I

    if-eq v0, v2, :cond_5f

    if-eq v0, v5, :cond_20

    goto/16 :goto_153

    :cond_20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbScrollRange()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ざっざへづ:F

    sub-float v1, p1, v1

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v0, :cond_33

    int-to-float v0, v0

    div-float/2addr v1, v0

    goto :goto_3e

    :cond_33
    cmpl-float v0, v1, v4

    if-lez v0, :cond_3a

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_3e

    :cond_3a
    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, -0x40800000    # -1.0f

    :goto_3e
    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_45

    neg-float v1, v1

    :cond_45
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉ〲なぱぽた:F

    add-float/2addr v1, v0

    cmpg-float v5, v1, v4

    if-gez v5, :cond_4d

    goto :goto_55

    :cond_4d
    cmpl-float v4, v1, v3

    if-lez v4, :cond_54

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_55

    :cond_54
    move v4, v1

    :goto_55
    cmpl-float v0, v4, v0

    if-eqz v0, :cond_5e

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ざっざへづ:F

    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    :cond_5e
    return v2

    :cond_5f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->ざっざへづ:F

    sub-float v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ごづごきえ:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_85

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->でどあくず:F

    sub-float v3, v1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->ごづごきえ:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_153

    :cond_85
    iput v5, p0, Landroidx/appcompat/widget/SwitchCompat;->は〲ぱなで:I

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ざっざへづ:F

    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->でどあくず:F

    return v2

    :cond_93
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->は〲ぱなで:I

    if-ne v0, v5, :cond_f8

    .line 1
    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->は〲ぱなで:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v2, :cond_a7

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_a7

    const/4 v0, 0x1

    goto :goto_a8

    :cond_a7
    const/4 v0, 0x0

    :goto_a8
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    if-eqz v0, :cond_de

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぶでにく〼〳:Landroid/view/VelocityTracker;

    const/16 v6, 0x3e8

    invoke-virtual {v0, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぶでにく〼〳:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    iget v7, p0, Landroidx/appcompat/widget/SwitchCompat;->〻ぞまぎな〻:I

    int-to-float v7, v7

    cmpl-float v6, v6, v7

    if-lez v6, :cond_d9

    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_d1

    cmpg-float v0, v0, v4

    if-gez v0, :cond_d7

    goto :goto_d5

    :cond_d1
    cmpl-float v0, v0, v4

    if-lez v0, :cond_d7

    :goto_d5
    const/4 v0, 0x1

    goto :goto_df

    :cond_d7
    const/4 v0, 0x0

    goto :goto_df

    :cond_d9
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getTargetCheckedState()Z

    move-result v0

    goto :goto_df

    :cond_de
    move v0, v5

    :goto_df
    if-eq v0, v5, :cond_e4

    invoke-virtual {p0, v1}, Landroid/widget/CompoundButton;->playSoundEffect(I)V

    :cond_e4
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 2
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->setAction(I)V

    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 3
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return v2

    :cond_f8
    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->は〲ぱなで:I

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぶでにく〼〳:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_153

    :cond_100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_153

    .line 4
    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_113

    goto :goto_14b

    :cond_113
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbOffset()I

    move-result v4

    iget-object v5, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->ぅみぱぎぎ:I

    iget v6, p0, Landroidx/appcompat/widget/SwitchCompat;->ごづごきえ:I

    sub-int/2addr v5, v6

    iget v7, p0, Landroidx/appcompat/widget/SwitchCompat;->どぇぞほだ:I

    add-int/2addr v7, v4

    sub-int/2addr v7, v6

    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->なぶひせが:I

    add-int/2addr v4, v7

    iget-object v8, p0, Landroidx/appcompat/widget/SwitchCompat;->げがぴうあだ:Landroid/graphics/Rect;

    iget v9, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v9

    iget v8, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v8

    add-int/2addr v4, v6

    iget v8, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺづげぺが:I

    add-int/2addr v8, v6

    int-to-float v6, v7

    cmpl-float v6, v0, v6

    if-lez v6, :cond_14b

    int-to-float v4, v4

    cmpg-float v4, v0, v4

    if-gez v4, :cond_14b

    int-to-float v4, v5

    cmpl-float v4, v3, v4

    if-lez v4, :cond_14b

    int-to-float v4, v8

    cmpg-float v4, v3, v4

    if-gez v4, :cond_14b

    const/4 v1, 0x1

    :cond_14b
    :goto_14b
    if-eqz v1, :cond_153

    .line 5
    iput v2, p0, Landroidx/appcompat/widget/SwitchCompat;->は〲ぱなで:I

    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ざっざへづ:F

    iput v3, p0, Landroidx/appcompat/widget/SwitchCompat;->でどあくず:F

    :cond_153
    :goto_153
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setChecked(Z)V
    .registers 6

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    if-eqz v0, :cond_3e

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3e

    if-eqz p1, :cond_19

    goto :goto_1a

    :cond_19
    const/4 v1, 0x0

    .line 1
    :goto_1a
    sget-object p1, Landroidx/appcompat/widget/SwitchCompat;->ながふずは:Landroid/util/Property;

    const/4 v0, 0x1

    new-array v2, v0, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    invoke-static {p0, p1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0xfa

    invoke-virtual {p1, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt p1, v1, :cond_38

    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    :cond_38
    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_4c

    .line 2
    :cond_3e
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺でおいここ:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_45

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    :cond_45
    if-eqz p1, :cond_48

    goto :goto_49

    :cond_48
    const/4 v1, 0x0

    .line 3
    :goto_49
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    :goto_4c
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いたぷすいだ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setShowText(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ざとぅぼこ〺:Z

    if-eq v0, p1, :cond_9

    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ざとぅぼこ〺:Z

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    :cond_9
    return-void
.end method

.method public setSplitTrack(Z)V
    .registers 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->おぐぴう〸ず:Z

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setSwitchMinWidth(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->のぷのちつ:I

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setSwitchPadding(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->へぬ〴づぞ:I

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setSwitchTextAppearance(Landroid/content/Context;I)V
    .registers 7

    sget-object v0, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance:[I

    .line 1
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textColor:I

    .line 3
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1c

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_1c

    invoke-static {p1, v1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_1c

    goto :goto_20

    :cond_1c
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :goto_20
    if-eqz p1, :cond_23

    goto :goto_27

    .line 4
    :cond_23
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    :goto_27
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->せづっ〸ちね:Landroid/content/res/ColorStateList;

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textSize:I

    .line 5
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    if-eqz p1, :cond_44

    int-to-float p1, p1

    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_44

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    :cond_44
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_typeface:I

    const/4 v0, -0x1

    .line 7
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    .line 8
    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_android_textStyle:I

    .line 9
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-eq p1, v1, :cond_63

    const/4 v1, 0x2

    if-eq p1, v1, :cond_60

    const/4 v1, 0x3

    if-eq p1, v1, :cond_5d

    move-object p1, v3

    goto :goto_65

    .line 10
    :cond_5d
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_65

    :cond_60
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_65

    :cond_63
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_65
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;I)V

    .line 11
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->TextAppearance_textAllCaps:I

    .line 12
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    if-eqz p1, :cond_7c

    .line 13
    new-instance p1, Lづざかべべ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lづざかべべ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->おかぷせ〱:Landroid/text/method/TransformationMethod;

    goto :goto_7e

    :cond_7c
    iput-object v3, p0, Landroidx/appcompat/widget/SwitchCompat;->おかぷせ〱:Landroid/text/method/TransformationMethod;

    .line 14
    :goto_7e
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public setSwitchTypeface(Landroid/graphics/Typeface;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    :cond_14
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_29

    if-eqz p1, :cond_29

    :cond_1e
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    :cond_29
    return-void
.end method

.method public setSwitchTypeface(Landroid/graphics/Typeface;I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-lez p2, :cond_33

    if-nez p1, :cond_b

    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_f

    :cond_b
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_f
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    move-result p1

    goto :goto_1a

    :cond_19
    const/4 p1, 0x0

    :goto_1a
    xor-int/lit8 p1, p1, -0x1

    and-int/2addr p1, p2

    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    and-int/lit8 v2, p1, 0x1

    if-eqz v2, :cond_24

    const/4 v1, 0x1

    :cond_24
    invoke-virtual {p2, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_2f

    const/high16 v0, -0x41800000    # -0.25f

    :cond_2f
    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V

    goto :goto_40

    :cond_33
    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {p2, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V

    :goto_40
    return-void
.end method

.method public setTextOff(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉざぅち〻:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setTextOn(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぇぬぎばつ:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_8
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_f

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_f
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setThumbPosition(F)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉ〲なぱぽた:F

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setThumbResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setThumbTextPadding(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->てぜきぽく:I

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setThumbTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->づざかべべ:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->げつ〴ぬぐ()V

    return-void
.end method

.method public setThumbTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->なぎぱいぢぎ:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->げつ〴ぬぐ()V

    return-void
.end method

.method public setTrackDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_8
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_f

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_f
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setTrackResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setTrackDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setTrackTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->いいにぽつ:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ()V

    return-void
.end method

.method public setTrackTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺふねづ〺:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ()V

    return-void
.end method

.method public toggle()V
    .registers 2

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_11

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_f

    goto :goto_11

    :cond_f
    const/4 p1, 0x0

    goto :goto_12

    :cond_11
    :goto_11
    const/4 p1, 0x1

    :goto_12
    return p1
.end method

.method public final 〺つふすそ()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3b

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->いいにぽつ:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺふねづ〺:Z

    if-eqz v1, :cond_3b

    :cond_c
    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->いいにぽつ:Z

    if-eqz v1, :cond_1f

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1f
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺふねづ〺:Z

    if-eqz v0, :cond_2a

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3b

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3b
    return-void
.end method

.method public final くし〴〺ぅ(Ljava/lang/CharSequence;)Landroid/text/Layout;
    .registers 10

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->おかぷせ〱:Landroid/text/method/TransformationMethod;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1, p0}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_8
    move-object v1, p1

    new-instance p1, Landroid/text/StaticLayout;

    iget-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->ぉひのべい:Landroid/text/TextPaint;

    if-eqz v1, :cond_1b

    invoke-static {v1, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v0

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v0, v3

    move v3, v0

    goto :goto_1d

    :cond_1b
    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_1d
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    return-object p1
.end method

.method public final げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3b

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->づざかべべ:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->なぎぱいぢぎ:Z

    if-eqz v1, :cond_3b

    :cond_c
    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->づざかべべ:Z

    if-eqz v1, :cond_1f

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1f
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_2a

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3b

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3b
    return-void
.end method
