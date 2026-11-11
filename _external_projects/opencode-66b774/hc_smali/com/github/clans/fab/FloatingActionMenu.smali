.class public Lcom/github/clans/fab/FloatingActionMenu;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/clans/fab/FloatingActionMenu$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〱かけばぜぐ:Landroid/content/Context;

.field public 〱こか〺ぃせ:I

.field public 〳ぜぞぜべっ:I

.field public 〴ねぷぐくぼ:I

.field public 〺つふすそ:Landroid/animation/AnimatorSet;

.field public 〺でおいここ:Landroid/view/animation/Interpolator;

.field public 〻ぞまぎな〻:I

.field public ぁごぐすすぃ:I

.field public ぃぜぶの〸ぃ:I

.field public いいにぽつ:I

.field public ぅみぱぎぎ:F

.field public ぇ〳〲〺すっ:I

.field public ぇとしたべど:Z

.field public ぇぬぎばつ:I

.field public えがぐせほち:Landroid/graphics/Typeface;

.field public ぉ〲なぱぽた:I

.field public ぉざぅち〻:I

.field public ぉひのべい:I

.field public おかぷせ〱:Landroid/view/animation/Interpolator;

.field public おぐぴう〸ず:I

.field public かづげぃぁ〺:Landroid/animation/ValueAnimator;

.field public ぎきぁ〱ぢ:Ljava/lang/String;

.field public くぎぶ〼のそ:Lcom/github/clans/fab/FloatingActionMenu$くし〴〺ぅ;

.field public くし〴〺ぅ:Landroid/animation/AnimatorSet;

.field public くねねぱす〻:Z

.field public けときぜと:I

.field public げがぴうあだ:Z

.field public こ〲しでおか:Landroid/view/animation/Animation;

.field public ごづごきえ:Landroid/content/res/ColorStateList;

.field public ごまけがぢは:Landroid/widget/ImageView;

.field public ざっざへづ:F

.field public ざとぅぼこ〺:I

.field public じぜこほぱ:F

.field public ずまげせび〳:Landroid/animation/ValueAnimator;

.field public せづっ〸ちね:I

.field public ち〴みぎ〻び:I

.field public づざかべべ:I

.field public ておぞぞはね:I

.field public てぜきぽく:Z

.field public でどあくず:I

.field public どぇぞほだ:F

.field public な〱ちぉじ:Z

.field public ながふずは:I

.field public なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

.field public なぶひせが:I

.field public のね〱ばぁぢ:Z

.field public のぷのちつ:Landroid/os/Handler;

.field public は〲ぱなで:I

.field public はつきどっ:I

.field public ばおぢでぎか:Z

.field public びえぁぜい:Z

.field public びぐびあび:Landroid/animation/AnimatorSet;

.field public ぶでにく〼〳:Z

.field public ぷぞてのほき:Landroid/graphics/drawable/Drawable;

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:I

.field public ぺがぅす〹ち:Landroid/view/animation/Animation;

.field public ぺづげぺが:I

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/github/clans/fab/FloatingActionMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/github/clans/fab/FloatingActionMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 14

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Landroid/animation/AnimatorSet;

    invoke-direct {p3}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    new-instance p3, Landroid/animation/AnimatorSet;

    invoke-direct {p3}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->〳ぜぞぜべっ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺぁあねじ:I

    new-instance p3, Landroid/os/Handler;

    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    iput-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->のぷのちつ:Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {p3, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇぬぎばつ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {p3, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉざぅち〻:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ざとぅぼこ〺:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->は〲ぱなで:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {p3, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->でどあくず:I

    iput v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->どぇぞほだ:F

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぅみぱぎぎ:F

    iput v2, p0, Lcom/github/clans/fab/FloatingActionMenu;->じぜこほぱ:F

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇとしたべど:Z

    iput-boolean p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ばおぢでぎか:Z

    .line 1
    sget-object v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_buttonSpacing:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_margin:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->〳ぜぞぜべっ:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〳ぜぞぜべっ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_position:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_showAnimation:I

    if-nez p2, :cond_a6

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_slide_in_from_right:I

    goto :goto_a8

    :cond_a6
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_slide_in_from_left:I

    :goto_a8
    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->へぬ〴づぞ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_hideAnimation:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    if-nez v1, :cond_b7

    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_slide_out_to_right:I

    goto :goto_b9

    :cond_b7
    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_slide_out_to_left:I

    :goto_b9
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->おぐぴう〸ず:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_paddingTop:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇぬぎばつ:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇぬぎばつ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_paddingRight:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉざぅち〻:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉざぅち〻:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_paddingBottom:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ざとぅぼこ〺:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ざとぅぼこ〺:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_paddingLeft:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->は〲ぱなで:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->は〲ぱなで:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_textColor:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごづごきえ:Landroid/content/res/ColorStateList;

    const/4 v1, -0x1

    if-nez p2, :cond_f8

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごづごきえ:Landroid/content/res/ColorStateList;

    :cond_f8
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_textSize:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->labels_text_size:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ざっざへづ:F

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_cornerRadius:I

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->でどあくず:I

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->でどあくず:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_showShadow:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぶでにく〼〳:Z

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_colorNormal:I

    const v3, -0xcccccd

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〻ぞまぎな〻:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_colorPressed:I

    const v3, -0xbbbbbc

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉ〲なぱぽた:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_colorRipple:I

    const v3, 0x66ffffff

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇ〳〲〺すっ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_showShadow:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->びえぁぜい:Z

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_shadowColor:I

    const/high16 v3, 0x66000000

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぶひせが:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_shadowRadius:I

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->どぇぞほだ:F

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->どぇぞほだ:F

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_shadowXOffset:I

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぅみぱぎぎ:F

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぅみぱぎぎ:F

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_shadowYOffset:I

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->じぜこほぱ:F

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->じぜこほぱ:F

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_colorNormal:I

    const v3, -0x25bcca

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺづげぺが:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_colorPressed:I

    const v3, -0x18afbd

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉひのべい:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_colorRipple:I

    const v3, -0x66000001

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->せづっ〸ちね:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_animationDelayPerItem:I

    const/16 v3, 0x32

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_icon:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぷぞてのほき:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_1ae

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v3, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ;->fab_add:I

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぷぞてのほき:Landroid/graphics/drawable/Drawable;

    :cond_1ae
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_singleLine:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->げがぴうあだ:Z

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_ellipsize:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ながふずは:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_maxLines:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぃぜぶの〸ぃ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_fab_size:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ておぞぞはね:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_style:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ち〴みぎ〻び:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_customFont:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :try_start_1dc
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-static {v1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    iput-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->えがぐせほち:Landroid/graphics/Typeface;
    :try_end_1f0
    .catch Ljava/lang/RuntimeException; {:try_start_1dc .. :try_end_1f0} :catch_396

    :cond_1f0
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_openDirection:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〱こか〺ぃせ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_backgroundColor:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_fab_label:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_210

    iput-boolean p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->な〱ちぉじ:Z

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぎきぁ〱ぢ:Ljava/lang/String;

    :cond_210
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_labels_padding:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_224

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    .line 2
    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇぬぎばつ:I

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉざぅち〻:I

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ざとぅぼこ〺:I

    iput p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->は〲ぱなで:I

    .line 3
    :cond_224
    new-instance p2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {p2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->おかぷせ〱:Landroid/view/animation/Interpolator;

    new-instance p2, Landroid/view/animation/AnticipateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/AnticipateInterpolator;-><init>()V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺でおいここ:Landroid/view/animation/Interpolator;

    new-instance p2, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ち〴みぎ〻び:I

    invoke-direct {p2, v1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〱かけばぜぐ:Landroid/content/Context;

    .line 4
    iget p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result p2

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v3

    iget v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    const/4 v5, 0x2

    new-array v6, v5, [I

    aput v2, v6, v2

    aput p2, v6, p3

    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v6

    iput-object v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ずまげせび〳:Landroid/animation/ValueAnimator;

    const-wide/16 v7, 0x12c

    invoke-virtual {v6, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ずまげせび〳:Landroid/animation/ValueAnimator;

    new-instance v9, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v9, p0, v1, v3, v4}, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;III)V

    invoke-virtual {v6, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v6, v5, [I

    aput p2, v6, v2

    aput v2, v6, p3

    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->かづげぃぁ〺:Landroid/animation/ValueAnimator;

    invoke-virtual {p2, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->かづげぃぁ〺:Landroid/animation/ValueAnimator;

    new-instance v6, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v6, p0, v1, v3, v4}, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;III)V

    invoke-virtual {p2, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    new-instance p2, Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/github/clans/fab/FloatingActionButton;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    iget-boolean v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->びえぁぜい:Z

    iput-boolean v1, p2, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    if-eqz v1, :cond_2c5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->どぇぞほだ:F

    invoke-static {v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v1

    iput v1, p2, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぅみぱぎぎ:F

    invoke-static {v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v1

    iput v1, p2, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->じぜこほぱ:F

    invoke-static {v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v1

    iput v1, p2, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    :cond_2c5
    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺづげぺが:I

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉひのべい:I

    iget v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->せづっ〸ちね:I

    .line 6
    iput v1, p2, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    iput v3, p2, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ:I

    iput v4, p2, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺:I

    .line 7
    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぶひせが:I

    iput v1, p2, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ておぞぞはね:I

    iput v1, p2, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    invoke-virtual {p2}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぎきぁ〱ぢ:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/github/clans/fab/FloatingActionButton;->setLabelText(Ljava/lang/String;)V

    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぷぞてのほき:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-super {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 8
    iget p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〱こか〺ぃせ:I

    const/high16 v1, -0x3cf90000    # -135.0f

    if-nez p2, :cond_315

    iget p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    if-nez p2, :cond_310

    const/high16 v3, -0x3cf90000    # -135.0f

    goto :goto_312

    :cond_310
    const/high16 v3, 0x43070000    # 135.0f

    :goto_312
    if-nez p2, :cond_320

    goto :goto_322

    :cond_315
    iget p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    if-nez p2, :cond_31c

    const/high16 v3, 0x43070000    # 135.0f

    goto :goto_31e

    :cond_31c
    const/high16 v3, -0x3cf90000    # -135.0f

    :goto_31e
    if-nez p2, :cond_322

    :cond_320
    const/high16 v1, 0x43070000    # 135.0f

    :cond_322
    :goto_322
    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    new-array v4, v5, [F

    aput v3, v4, v2

    aput v0, v4, p3

    const-string v3, "rotation"

    invoke-static {p2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    iget-object v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    new-array v5, v5, [F

    aput v0, v5, v2

    aput v1, v5, p3

    invoke-static {v4, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {p3, p2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->おかぷせ〱:Landroid/view/animation/Interpolator;

    invoke-virtual {p2, p3}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺でおいここ:Landroid/view/animation/Interpolator;

    invoke-virtual {p2, p3}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    invoke-virtual {p2, v7, v8}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {p2, v7, v8}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 9
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_fab_show_animation:I

    sget p3, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_scale_up:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/github/clans/fab/FloatingActionMenu;->setMenuButtonShowAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionMenu_menu_fab_hide_animation:I

    sget p3, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_scale_down:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/github/clans/fab/FloatingActionMenu;->setMenuButtonHideAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 10
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catch_396
    move-exception p1

    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unable to load specified custom font: "

    invoke-static {v0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method private setLabelEllipsize(Lcom/github/clans/fab/Label;)V
    .registers 4

    iget v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ながふずは:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_18

    const/4 v1, 0x2

    if-eq v0, v1, :cond_15

    const/4 v1, 0x3

    if-eq v0, v1, :cond_12

    const/4 v1, 0x4

    if-eq v0, v1, :cond_f

    goto :goto_1d

    :cond_f
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_1a

    :cond_12
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    goto :goto_1a

    :cond_15
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_1a

    :cond_18
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    :goto_1a
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    :goto_1d
    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    instance-of p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    return p1
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 1
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 1
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 2
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getAnimationDelayPerItem()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    return v0
.end method

.method public getIconToggleAnimatorSet()Landroid/animation/AnimatorSet;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->びぐびあび:Landroid/animation/AnimatorSet;

    return-object v0
.end method

.method public getMenuButtonColorNormal()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺづげぺが:I

    return v0
.end method

.method public getMenuButtonColorPressed()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉひのべい:I

    return v0
.end method

.method public getMenuButtonColorRipple()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->せづっ〸ちね:I

    return v0
.end method

.method public getMenuButtonLabelText()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぎきぁ〱ぢ:Ljava/lang/String;

    return-object v0
.end method

.method public getMenuIconView()Landroid/widget/ImageView;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    return-object v0
.end method

.method public onFinishInflate()V
    .registers 11

    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_15
    iget v2, p0, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    if-ge v1, v2, :cond_109

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    if-ne v2, v3, :cond_23

    goto/16 :goto_105

    :cond_23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/github/clans/fab/FloatingActionButton;

    sget v3, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_33

    goto/16 :goto_105

    .line 2
    :cond_33
    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->getLabelText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3f

    goto/16 :goto_f9

    :cond_3f
    new-instance v5, Lcom/github/clans/fab/Label;

    iget-object v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->〱かけばぜぐ:Landroid/content/Context;

    invoke-direct {v5, v6}, Lcom/github/clans/fab/Label;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setClickable(Z)V

    invoke-virtual {v5, v2}, Lcom/github/clans/fab/Label;->setFab(Lcom/github/clans/fab/FloatingActionButton;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    iget v8, p0, Lcom/github/clans/fab/FloatingActionMenu;->へぬ〴づぞ:I

    invoke-static {v7, v8}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/github/clans/fab/Label;->setShowAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    iget v8, p0, Lcom/github/clans/fab/FloatingActionMenu;->おぐぴう〸ず:I

    invoke-static {v7, v8}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/github/clans/fab/Label;->setHideAnimation(Landroid/view/animation/Animation;)V

    iget v7, p0, Lcom/github/clans/fab/FloatingActionMenu;->ち〴みぎ〻び:I

    if-lez v7, :cond_7b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    iget v8, p0, Lcom/github/clans/fab/FloatingActionMenu;->ち〴みぎ〻び:I

    invoke-virtual {v5, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    invoke-virtual {v5, v0}, Lcom/github/clans/fab/Label;->setShowShadow(Z)V

    invoke-virtual {v5, v6}, Lcom/github/clans/fab/Label;->setUsingStyle(Z)V

    goto :goto_e2

    :cond_7b
    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->〻ぞまぎな〻:I

    iget v7, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉ〲なぱぽた:I

    iget v8, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇ〳〲〺すっ:I

    .line 3
    iput v6, v5, Lcom/github/clans/fab/Label;->いいにぽつ:I

    iput v7, v5, Lcom/github/clans/fab/Label;->ぺふねづ〺:I

    iput v8, v5, Lcom/github/clans/fab/Label;->てぜきぽく:I

    .line 4
    iget-boolean v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぶでにく〼〳:Z

    invoke-virtual {v5, v6}, Lcom/github/clans/fab/Label;->setShowShadow(Z)V

    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->でどあくず:I

    invoke-virtual {v5, v6}, Lcom/github/clans/fab/Label;->setCornerRadius(I)V

    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ながふずは:I

    if-lez v6, :cond_98

    invoke-direct {p0, v5}, Lcom/github/clans/fab/FloatingActionMenu;->setLabelEllipsize(Lcom/github/clans/fab/Label;)V

    :cond_98
    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぃぜぶの〸ぃ:I

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v5}, Lcom/github/clans/fab/Label;->づざかべべ()V

    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ざっざへづ:F

    invoke-virtual {v5, v0, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごづごきえ:Landroid/content/res/ColorStateList;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->は〲ぱなで:I

    iget v7, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇぬぎばつ:I

    iget-boolean v8, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぶでにく〼〳:Z

    if-eqz v8, :cond_ce

    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->getShadowRadius()I

    move-result v8

    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->getShadowXOffset()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    add-int/2addr v9, v8

    add-int/2addr v6, v9

    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->getShadowRadius()I

    move-result v8

    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->getShadowYOffset()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    add-int/2addr v9, v8

    add-int/2addr v7, v9

    :cond_ce
    iget v8, p0, Lcom/github/clans/fab/FloatingActionMenu;->は〲ぱなで:I

    iget v9, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇぬぎばつ:I

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    iget v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぃぜぶの〸ぃ:I

    if-ltz v6, :cond_dd

    iget-boolean v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->げがぴうあだ:Z

    if-eqz v6, :cond_e2

    :cond_dd
    iget-boolean v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->げがぴうあだ:Z

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    :cond_e2
    :goto_e2
    iget-object v6, p0, Lcom/github/clans/fab/FloatingActionMenu;->えがぐせほち:Landroid/graphics/Typeface;

    if-eqz v6, :cond_e9

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_e9
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->getOnClickListener()Landroid/view/View$OnClickListener;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3, v5}, Landroid/widget/ImageButton;->setTag(ILjava/lang/Object;)V

    .line 5
    :goto_f9
    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    if-ne v2, v3, :cond_105

    new-instance v2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-direct {v2, p0}, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;)V

    invoke-virtual {v3, v2}, Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_105
    :goto_105
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_15

    :cond_109
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 13

    iget p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    if-nez p1, :cond_10

    sub-int/2addr p4, p2

    iget p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    div-int/lit8 p1, p1, 0x2

    sub-int/2addr p4, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p1

    sub-int/2addr p4, p1

    goto :goto_1a

    :cond_10
    iget p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p2

    add-int p4, p2, p1

    :goto_1a
    iget p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->〱こか〺ぃせ:I

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-nez p1, :cond_22

    const/4 p1, 0x1

    goto :goto_23

    :cond_22
    const/4 p1, 0x0

    :goto_23
    if-eqz p1, :cond_33

    sub-int/2addr p5, p3

    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p3}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    goto :goto_37

    :cond_33
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p5

    :goto_37
    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p3}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int p3, p4, p3

    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, p3

    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v3}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v3, p5

    invoke-virtual {v1, p3, p5, v2, v3}, Landroid/widget/ImageButton;->layout(IIII)V

    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    invoke-virtual {p3}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int p3, p4, p3

    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, p5

    iget-object v2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, p3

    iget-object v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v2, p3, v1, v3, v4}, Landroid/widget/ImageView;->layout(IIII)V

    if-eqz p1, :cond_8b

    iget-object p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {p3}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result p3

    add-int/2addr p3, p5

    iget p5, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    add-int/2addr p5, p3

    :cond_8b
    iget p3, p0, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    sub-int/2addr p3, p2

    :goto_8e
    if-ltz p3, :cond_13e

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    if-ne p2, v1, :cond_9a

    goto/16 :goto_13a

    :cond_9a
    move-object v1, p2

    check-cast v1, Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_a7

    goto/16 :goto_13a

    :cond_a7
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int v2, p4, v2

    if-eqz p1, :cond_b9

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v3

    sub-int/2addr p5, v3

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    sub-int/2addr p5, v3

    :cond_b9
    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    if-eq v1, v3, :cond_d1

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, p5

    invoke-virtual {v1, v2, p5, v3, v4}, Landroid/widget/ImageButton;->layout(IIII)V

    iget-boolean v2, p0, Lcom/github/clans/fab/FloatingActionMenu;->てぜきぽく:Z

    if-nez v2, :cond_d1

    invoke-virtual {v1, v0}, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ(Z)V

    :cond_d1
    sget v2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_12c

    iget-boolean v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->な〱ちぉじ:Z

    if-eqz v3, :cond_e2

    iget v3, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    goto :goto_e6

    :cond_e2
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v3

    :goto_e6
    div-int/lit8 v3, v3, 0x2

    iget v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->〳ぜぞぜべっ:I

    add-int/2addr v3, v4

    iget v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    if-nez v4, :cond_f2

    sub-int v3, p4, v3

    goto :goto_f3

    :cond_f2
    add-int/2addr v3, p4

    :goto_f3
    if-nez v4, :cond_fc

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    sub-int v4, v3, v4

    goto :goto_101

    :cond_fc
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v3

    :goto_101
    iget v5, p0, Lcom/github/clans/fab/FloatingActionMenu;->はつきどっ:I

    if-nez v5, :cond_107

    move v6, v4

    goto :goto_108

    :cond_107
    move v6, v3

    :goto_108
    if-nez v5, :cond_10b

    goto :goto_10c

    :cond_10b
    move v3, v4

    :goto_10c
    iget v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺぁあねじ:I

    sub-int v4, p5, v4

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    sub-int/2addr v1, v5

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v4

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v2, v6, v1, v3, v4}, Landroid/view/View;->layout(IIII)V

    iget-boolean v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->てぜきぽく:Z

    if-nez v1, :cond_12c

    const/4 v1, 0x4

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_12c
    if-eqz p1, :cond_132

    iget p2, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    sub-int/2addr p5, p2

    goto :goto_13a

    :cond_132
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, p5

    iget p5, p0, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    add-int/2addr p5, p2

    :goto_13a
    add-int/lit8 p3, p3, -0x1

    goto/16 :goto_8e

    :cond_13e
    return-void
.end method

.method public onMeasure(II)V
    .registers 18

    move-object v6, p0

    const/4 v7, 0x0

    iput v7, v6, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    iget-object v1, v6, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    const/4 v8, 0x0

    :goto_11
    iget v0, v6, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    const/16 v9, 0x8

    if-ge v8, v0, :cond_40

    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v9, :cond_3d

    iget-object v0, v6, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    if-ne v10, v0, :cond_26

    goto :goto_3d

    :cond_26
    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v10

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    iget v0, v6, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v6, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    :cond_3d
    :goto_3d
    add-int/lit8 v8, v8, 0x1

    goto :goto_11

    :cond_40
    const/4 v0, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    :goto_43
    iget v1, v6, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    const/4 v2, 0x1

    if-ge v8, v1, :cond_af

    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eq v3, v9, :cond_ac

    iget-object v3, v6, Lcom/github/clans/fab/FloatingActionMenu;->ごまけがぢは:Landroid/widget/ImageView;

    if-ne v1, v3, :cond_57

    goto :goto_ac

    :cond_57
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/lit8 v11, v3, 0x0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int v12, v3, v0

    sget v0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {v1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/github/clans/fab/Label;

    if-eqz v13, :cond_ab

    iget v0, v6, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v0, v3

    iget-boolean v3, v6, Lcom/github/clans/fab/FloatingActionMenu;->な〱ちぉじ:Z

    if-eqz v3, :cond_7a

    goto :goto_7b

    :cond_7a
    const/4 v2, 0x2

    :goto_7b
    div-int v14, v0, v2

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 1
    iget-boolean v1, v13, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_8f

    iget v1, v13, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v2, v13, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr v2, v1

    goto :goto_90

    :cond_8f
    const/4 v2, 0x0

    :goto_90
    add-int/2addr v0, v2

    .line 2
    iget v1, v6, Lcom/github/clans/fab/FloatingActionMenu;->〳ぜぞぜべっ:I

    add-int/2addr v0, v1

    add-int v3, v0, v14

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v13

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    invoke-virtual {v13}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v0, v11

    add-int/2addr v0, v14

    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v10, v0

    :cond_ab
    move v0, v12

    :cond_ac
    :goto_ac
    add-int/lit8 v8, v8, 0x1

    goto :goto_43

    :cond_af
    iget v1, v6, Lcom/github/clans/fab/FloatingActionMenu;->ぁごぐすすぃ:I

    iget v3, v6, Lcom/github/clans/fab/FloatingActionMenu;->〳ぜぞぜべっ:I

    add-int/2addr v10, v3

    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v3

    iget v3, v6, Lcom/github/clans/fab/FloatingActionMenu;->づざかべべ:I

    iget v4, v6, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    sub-int/2addr v4, v2

    mul-int v4, v4, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    add-int/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v3, v0

    int-to-double v2, v3

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    .line 3
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v4, v2

    double-to-int v0, v4

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_103

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v1

    move/from16 v2, p1

    invoke-static {v1, v2}, Landroid/view/ViewGroup;->getDefaultSize(II)I

    move-result v1

    :cond_103
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v2, v3, :cond_115

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v0

    move/from16 v2, p2

    invoke-static {v0, v2}, Landroid/view/ViewGroup;->getDefaultSize(II)I

    move-result v0

    :cond_115
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 4

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->くねねぱす〻:Z

    if-eqz v0, :cond_19

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_16

    if-eq p1, v1, :cond_f

    goto :goto_18

    :cond_f
    iget-boolean p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇとしたべど:Z

    invoke-virtual {p0, p1}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    const/4 v0, 0x1

    goto :goto_18

    .line 1
    :cond_16
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺふねづ〺:Z

    :goto_18
    return v0

    .line 2
    :cond_19
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setAnimated(Z)V
    .registers 9

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぇとしたべど:Z

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    const-wide/16 v1, 0x12c

    const-wide/16 v3, 0x0

    if-eqz p1, :cond_c

    move-wide v5, v1

    goto :goto_d

    :cond_c
    move-wide v5, v3

    :goto_d
    invoke-virtual {v0, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    if-eqz p1, :cond_15

    goto :goto_16

    :cond_15
    move-wide v1, v3

    :goto_16
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    return-void
.end method

.method public setAnimationDelayPerItem(I)V
    .registers 2

    iput p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    return-void
.end method

.method public setClosedOnTouchOutside(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->くねねぱす〻:Z

    return-void
.end method

.method public setIconAnimated(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ばおぢでぎか:Z

    return-void
.end method

.method public setIconAnimationCloseInterpolator(Landroid/view/animation/Interpolator;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-void
.end method

.method public setIconAnimationInterpolator(Landroid/view/animation/Interpolator;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-void
.end method

.method public setIconAnimationOpenInterpolator(Landroid/view/animation/Interpolator;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-void
.end method

.method public setIconToggleAnimatorSet(Landroid/animation/AnimatorSet;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->びぐびあび:Landroid/animation/AnimatorSet;

    return-void
.end method

.method public setMenuButtonColorNormal(I)V
    .registers 3

    iput p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺづげぺが:I

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorNormal(I)V

    return-void
.end method

.method public setMenuButtonColorNormalResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺづげぺが:I

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorNormalResId(I)V

    return-void
.end method

.method public setMenuButtonColorPressed(I)V
    .registers 3

    iput p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉひのべい:I

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorPressed(I)V

    return-void
.end method

.method public setMenuButtonColorPressedResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぉひのべい:I

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorPressedResId(I)V

    return-void
.end method

.method public setMenuButtonColorRipple(I)V
    .registers 3

    iput p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->せづっ〸ちね:I

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorRipple(I)V

    return-void
.end method

.method public setMenuButtonColorRippleResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->せづっ〸ちね:I

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorRippleResId(I)V

    return-void
.end method

.method public setMenuButtonHideAnimation(Landroid/view/animation/Animation;)V
    .registers 3

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺがぅす〹ち:Landroid/view/animation/Animation;

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setHideAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public setMenuButtonLabelText(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setLabelText(Ljava/lang/String;)V

    return-void
.end method

.method public setMenuButtonShowAnimation(Landroid/view/animation/Animation;)V
    .registers 3

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->こ〲しでおか:Landroid/view/animation/Animation;

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setShowAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public setOnMenuButtonClickListener(Landroid/view/View$OnClickListener;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnMenuButtonLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->なぎぱいぢぎ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setOnMenuToggleListener(Lcom/github/clans/fab/FloatingActionMenu$くし〴〺ぅ;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->くぎぶ〼のそ:Lcom/github/clans/fab/FloatingActionMenu$くし〴〺ぅ;

    return-void
.end method

.method public 〺つふすそ(Z)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_17

    if-eqz p1, :cond_14

    .line 2
    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->こ〲しでおか:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_14
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_17
    return-void
.end method

.method public げつ〴ぬぐ(Z)V
    .registers 11

    .line 1
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ぺふねづ〺:Z

    if-eqz v0, :cond_69

    .line 2
    iget v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->〴ねぷぐくぼ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_14

    .line 3
    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->かづげぃぁ〺:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_14
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->ばおぢでぎか:Z

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->びぐびあび:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_2a

    :cond_20
    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_2a
    :goto_2a
    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionMenu;->てぜきぽく:Z

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_2e
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-ge v1, v4, :cond_59

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Lcom/github/clans/fab/FloatingActionButton;

    if-eqz v5, :cond_56

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_56

    add-int/lit8 v0, v0, 0x1

    check-cast v4, Lcom/github/clans/fab/FloatingActionButton;

    iget-object v5, p0, Lcom/github/clans/fab/FloatingActionMenu;->のぷのちつ:Landroid/os/Handler;

    new-instance v6, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;

    invoke-direct {v6, p0, v4, p1}, Lcom/github/clans/fab/FloatingActionMenu$げつ〴ぬぐ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;Lcom/github/clans/fab/FloatingActionButton;Z)V

    int-to-long v7, v3

    invoke-virtual {v5, v6, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget v4, p0, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    add-int/2addr v3, v4

    :cond_56
    add-int/lit8 v1, v1, 0x1

    goto :goto_2e

    :cond_59
    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionMenu;->のぷのちつ:Landroid/os/Handler;

    new-instance v1, Lcom/github/clans/fab/FloatingActionMenu$〺つふすそ;

    invoke-direct {v1, p0}, Lcom/github/clans/fab/FloatingActionMenu$〺つふすそ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;)V

    add-int/2addr v0, v2

    iget v2, p0, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    mul-int v0, v0, v2

    int-to-long v2, v0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_69
    return-void
.end method
