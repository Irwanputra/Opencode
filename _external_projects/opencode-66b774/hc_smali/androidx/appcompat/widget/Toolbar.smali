.class public Landroidx/appcompat/widget/Toolbar;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/Toolbar$びぐびあび;,
        Landroidx/appcompat/widget/Toolbar$SavedState;,
        Landroidx/appcompat/widget/Toolbar$LayoutParams;,
        Landroidx/appcompat/widget/Toolbar$づざかべべ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/CharSequence;

.field public 〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

.field public 〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

.field public 〻ぞまぎな〻:I

.field public ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

.field public final ぃぜぶの〸ぃ:Ljava/lang/Runnable;

.field public いいにぽつ:Landroid/view/View;

.field public ぅみぱぎぎ:Z

.field public ぇ〳〲〺すっ:Ljava/lang/CharSequence;

.field public ぇとしたべど:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

.field public ぇぬぎばつ:I

.field public ぉ〲なぱぽた:Ljava/lang/CharSequence;

.field public ぉざぅち〻:I

.field public final ぉひのべい:[I

.field public おかぷせ〱:Landroidx/appcompat/widget/ActionMenuPresenter;

.field public おぐぴう〸ず:I

.field public くし〴〺ぅ:Landroid/widget/TextView;

.field public けときぜと:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

.field public げがぴうあだ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

.field public ごづごきえ:I

.field public ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

.field public ざとぅぼこ〺:I

.field public final じぜこほぱ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public せづっ〸ちね:Landroidx/appcompat/widget/Toolbar$づざかべべ;

.field public づざかべべ:Landroid/widget/ImageButton;

.field public てぜきぽく:I

.field public でどあくず:I

.field public どぇぞほだ:Z

.field public ながふずは:Z

.field public なぎぱいぢぎ:Landroid/widget/ImageView;

.field public なぶひせが:Landroid/content/res/ColorStateList;

.field public のぷのちつ:I

.field public は〲ぱなで:I

.field public びえぁぜい:Landroid/content/res/ColorStateList;

.field public びぐびあび:Landroid/widget/TextView;

.field public ぶでにく〼〳:I

.field public final ぷぞてのほき:Landroidx/appcompat/widget/ActionMenuView$びぐびあび;

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:Landroid/widget/ImageButton;

.field public final ぺづげぺが:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public ぺふねづ〺:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->toolbarStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 13

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const v0, 0x800013

    iput v0, p0, Landroidx/appcompat/widget/Toolbar;->〻ぞまぎな〻:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぉひのべい:[I

    new-instance v0, Landroidx/appcompat/widget/Toolbar$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぷぞてのほき:Landroidx/appcompat/widget/ActionMenuView$びぐびあび;

    new-instance v0, Landroidx/appcompat/widget/Toolbar$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$〺つふすそ;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぃぜぶの〸ぃ:Ljava/lang/Runnable;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar:[I

    const/4 v8, 0x0

    invoke-static {v0, p2, v3, p3, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v0

    .line 1
    iget-object v5, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v6, p3

    .line 2
    invoke-static/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleTextAppearance:I

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->のぷのちつ:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_subtitleTextAppearance:I

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_android_gravity:I

    iget p2, p0, Landroidx/appcompat/widget/Toolbar;->〻ぞまぎな〻:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぺふねづ〺(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->〻ぞまぎな〻:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_buttonGravity:I

    const/16 p2, 0x30

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぺふねづ〺(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleMargin:I

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleMargins:I

    invoke-virtual {v0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p3

    if-eqz p3, :cond_74

    invoke-virtual {v0, p2, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    :cond_74
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleMarginStart:I

    const/4 p2, -0x1

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    if-ltz p1, :cond_87

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    :cond_87
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleMarginEnd:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    if-ltz p1, :cond_91

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    :cond_91
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleMarginTop:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    if-ltz p1, :cond_9b

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    :cond_9b
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleMarginBottom:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    if-ltz p1, :cond_a5

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    :cond_a5
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_maxButtonHeight:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_contentInsetStart:I

    const/high16 p2, -0x80000000

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    sget p3, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_contentInsetEnd:I

    invoke-virtual {v0, p3, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p3

    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_contentInsetLeft:I

    invoke-virtual {v0, v1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v1

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_contentInsetRight:I

    invoke-virtual {v0, v2, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v2

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->びぐびあび()V

    iget-object v3, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    .line 3
    iput-boolean v8, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〳ぜぞぜべっ:Z

    if-eq v1, p2, :cond_d4

    iput v1, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->づざかべべ:I

    iput v1, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    :cond_d4
    if-eq v2, p2, :cond_da

    iput v2, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->なぎぱいぢぎ:I

    iput v2, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    :cond_da
    if-ne p1, p2, :cond_de

    if-eq p3, p2, :cond_e1

    .line 4
    :cond_de
    invoke-virtual {v3, p1, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ(II)V

    :cond_e1
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_contentInsetStartWithNavigation:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->でどあくず:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_contentInsetEndWithActions:I

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぶでにく〼〳:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_collapseIcon:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_collapseContentDescription:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ:Ljava/lang/CharSequence;

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_title:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_110

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_110
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_subtitle:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_11f

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_11f
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_popupTheme:I

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_navigationIcon:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_139

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    :cond_139
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_navigationContentDescription:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_148

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    :cond_148
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_logo:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_153

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    :cond_153
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_logoDescription:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_162

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V

    :cond_162
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_titleTextColor:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_171

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V

    :cond_171
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_subtitleTextColor:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_180

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V

    :cond_180
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->Toolbar_menu:I

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result p2

    if-eqz p2, :cond_197

    invoke-virtual {v0, p1, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p1

    .line 5
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 6
    :cond_197
    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .registers 3

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_c

    instance-of p1, p1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz p1, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    return p1
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 1
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public getCollapseContentDescription()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getCollapseIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getContentInsetEnd()I
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    if-eqz v0, :cond_e

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_b

    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    goto :goto_f

    :cond_b
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    return v0
.end method

.method public getContentInsetEndWithActions()I
    .registers 3

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->ぶでにく〼〳:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_7

    goto :goto_b

    :cond_7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    move-result v0

    :goto_b
    return v0
.end method

.method public getContentInsetLeft()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getContentInsetRight()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public getContentInsetStart()I
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    if-eqz v0, :cond_e

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_b

    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    goto :goto_f

    :cond_b
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    return v0
.end method

.method public getContentInsetStartWithNavigation()I
    .registers 3

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->でどあくず:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_7

    goto :goto_b

    :cond_7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    move-result v0

    :goto_b
    return v0
.end method

.method public getCurrentContentInsetEnd()I
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_11

    .line 2
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_11

    const/4 v0, 0x1

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    if-eqz v0, :cond_23

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    move-result v0

    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->ぶでにく〼〳:I

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_27

    :cond_23
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    move-result v0

    :goto_27
    return v0
.end method

.method public getCurrentContentInsetLeft()I
    .registers 3

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    move-result v0

    goto :goto_10

    :cond_c
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    move-result v0

    :goto_10
    return v0
.end method

.method public getCurrentContentInsetRight()I
    .registers 3

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    move-result v0

    goto :goto_10

    :cond_c
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    move-result v0

    :goto_10
    return v0
.end method

.method public getCurrentContentInsetStart()I
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->でどあくず:I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_1a

    :cond_16
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    move-result v0

    :goto_1a
    return v0
.end method

.method public getLogo()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getLogoDescription()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->づざかべべ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public getNavigationContentDescription()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getNavigationIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getOuterActionMenuPresenter()Landroidx/appcompat/widget/ActionMenuPresenter;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->おかぷせ〱:Landroidx/appcompat/widget/ActionMenuPresenter;

    return-object v0
.end method

.method public getOverflowIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->づざかべべ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getPopupContext()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    return-object v0
.end method

.method public getPopupTheme()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->てぜきぽく:I

    return v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぇ〳〲〺すっ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getSubtitleTextView()Landroid/widget/TextView;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぉ〲なぱぽた:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTitleMarginBottom()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    return v0
.end method

.method public getTitleMarginEnd()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    return v0
.end method

.method public getTitleMarginStart()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    return v0
.end method

.method public getTitleMarginTop()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    return v0
.end method

.method public final getTitleTextView()Landroid/widget/TextView;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    return-object v0
.end method

.method public getWrapper()Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->けときぜと:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    if-nez v0, :cond_c

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->けときぜと:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    :cond_c
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->けときぜと:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぃぜぶの〸ぃ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_b

    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->ぅみぱぎぎ:Z

    :cond_b
    iget-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->ぅみぱぎぎ:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1a

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-ne v0, v2, :cond_1a

    if-nez p1, :cond_1a

    iput-boolean v4, p0, Landroidx/appcompat/widget/Toolbar;->ぅみぱぎぎ:Z

    :cond_1a
    const/16 p1, 0xa

    if-eq v0, p1, :cond_21

    const/4 p1, 0x3

    if-ne v0, p1, :cond_23

    :cond_21
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->ぅみぱぎぎ:Z

    :cond_23
    return v4
.end method

.method public onLayout(ZIIII)V
    .registers 25

    move-object/from16 v0, p0

    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    :goto_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v9

    sub-int v10, v4, v7

    iget-object v11, v0, Landroidx/appcompat/widget/Toolbar;->ぉひのべい:[I

    aput v3, v11, v2

    aput v3, v11, v3

    invoke-static/range {p0 .. p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇぬぎばつ(Landroid/view/View;)I

    move-result v12

    if-ltz v12, :cond_3a

    sub-int v13, p5, p3

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    goto :goto_3b

    :cond_3a
    const/4 v12, 0x0

    :goto_3b
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_53

    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-eqz v1, :cond_4e

    invoke-virtual {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻(Landroid/view/View;I[II)I

    move-result v13

    move v14, v13

    move v13, v6

    goto :goto_55

    :cond_4e
    invoke-virtual {v0, v13, v6, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v13

    goto :goto_54

    :cond_53
    move v13, v6

    :goto_54
    move v14, v10

    :goto_55
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v0, v15}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_6a

    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    if-eqz v1, :cond_66

    invoke-virtual {v0, v15, v14, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻(Landroid/view/View;I[II)I

    move-result v14

    goto :goto_6a

    :cond_66
    invoke-virtual {v0, v15, v13, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v13

    :cond_6a
    :goto_6a
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0, v15}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_7f

    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_7b

    invoke-virtual {v0, v15, v13, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v13

    goto :goto_7f

    :cond_7b
    invoke-virtual {v0, v15, v14, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻(Landroid/view/View;I[II)I

    move-result v14

    :cond_7f
    :goto_7f
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetLeft()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetRight()I

    move-result v16

    sub-int v2, v15, v13

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    aput v2, v11, v3

    sub-int v2, v10, v14

    sub-int v2, v16, v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v17, 0x1

    aput v2, v11, v17

    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v10, v10, v16

    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_ba

    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    if-eqz v1, :cond_b6

    invoke-virtual {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻(Landroid/view/View;I[II)I

    move-result v10

    goto :goto_ba

    :cond_b6
    invoke-virtual {v0, v13, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v2

    :cond_ba
    :goto_ba
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_cf

    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-eqz v1, :cond_cb

    invoke-virtual {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻(Landroid/view/View;I[II)I

    move-result v10

    goto :goto_cf

    :cond_cb
    invoke-virtual {v0, v13, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v2

    :cond_cf
    :goto_cf
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v13

    iget-object v14, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v14

    if-eqz v13, :cond_f6

    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v15}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move/from16 p4, v7

    iget-object v7, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v7, v3

    iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v7, v3

    const/4 v3, 0x0

    add-int/2addr v7, v3

    goto :goto_f9

    :cond_f6
    move/from16 p4, v7

    const/4 v7, 0x0

    :goto_f9
    if-eqz v14, :cond_113

    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move/from16 v16, v4

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v15

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v3

    add-int/2addr v7, v4

    goto :goto_115

    :cond_113
    move/from16 v16, v4

    :goto_115
    if-nez v13, :cond_120

    if-eqz v14, :cond_11a

    goto :goto_120

    :cond_11a
    move/from16 v18, v6

    move/from16 p3, v12

    goto/16 :goto_285

    :cond_120
    :goto_120
    if-eqz v13, :cond_125

    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    goto :goto_127

    :cond_125
    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    :goto_127
    if-eqz v14, :cond_12c

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    goto :goto_12e

    :cond_12c
    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    :goto_12e
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz v13, :cond_144

    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v15

    if-gtz v15, :cond_14e

    :cond_144
    if-eqz v14, :cond_151

    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v15

    if-lez v15, :cond_151

    :cond_14e
    const/16 v17, 0x1

    goto :goto_153

    :cond_151
    const/16 v17, 0x0

    :goto_153
    iget v15, v0, Landroidx/appcompat/widget/Toolbar;->〻ぞまぎな〻:I

    and-int/lit8 v15, v15, 0x70

    move/from16 v18, v6

    const/16 v6, 0x30

    if-eq v15, v6, :cond_19b

    const/16 v6, 0x50

    if-eq v15, v6, :cond_18d

    sub-int v6, v5, v8

    sub-int/2addr v6, v9

    sub-int/2addr v6, v7

    div-int/lit8 v6, v6, 0x2

    iget v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move/from16 p3, v12

    iget v12, v0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    move/from16 p5, v2

    add-int v2, v15, v12

    if-ge v6, v2, :cond_176

    add-int v6, v15, v12

    goto :goto_18b

    :cond_176
    sub-int/2addr v5, v9

    sub-int/2addr v5, v7

    sub-int/2addr v5, v6

    sub-int/2addr v5, v8

    iget v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v3, v0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    add-int/2addr v2, v3

    if-ge v5, v2, :cond_18b

    iget v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    sub-int/2addr v2, v5

    sub-int/2addr v6, v2

    const/4 v2, 0x0

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_18b
    :goto_18b
    add-int/2addr v8, v6

    goto :goto_1aa

    :cond_18d
    move/from16 p5, v2

    move/from16 p3, v12

    sub-int/2addr v5, v9

    iget v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v5, v2

    iget v2, v0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    sub-int/2addr v5, v2

    sub-int v8, v5, v7

    goto :goto_1aa

    :cond_19b
    move/from16 p5, v2

    move/from16 p3, v12

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    add-int v8, v2, v3

    :goto_1aa
    if-eqz v1, :cond_21b

    if-eqz v17, :cond_1b1

    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    goto :goto_1b2

    :cond_1b1
    const/4 v1, 0x0

    :goto_1b2
    const/4 v2, 0x1

    aget v3, v11, v2

    sub-int/2addr v1, v3

    const/4 v3, 0x0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    sub-int/2addr v10, v4

    neg-int v1, v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v11, v2

    if-eqz v13, :cond_1e9

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    sub-int v2, v10, v2

    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v3, v8

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v4, v2, v8, v10, v3}, Landroid/widget/TextView;->layout(IIII)V

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    sub-int/2addr v2, v4

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v8, v3, v1

    goto :goto_1ea

    :cond_1e9
    move v2, v10

    :goto_1ea
    if-eqz v14, :cond_210

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v1

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    sub-int v1, v10, v1

    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v3, v8

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v4, v1, v8, v10, v3}, Landroid/widget/TextView;->layout(IIII)V

    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    sub-int v1, v10, v1

    goto :goto_211

    :cond_210
    move v1, v10

    :goto_211
    if-eqz v17, :cond_218

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    move v10, v1

    :cond_218
    move/from16 v2, p5

    goto :goto_285

    :cond_21b
    if-eqz v17, :cond_220

    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    goto :goto_221

    :cond_220
    const/4 v1, 0x0

    :goto_221
    const/4 v2, 0x0

    aget v3, v11, v2

    sub-int/2addr v1, v3

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int v3, v3, p5

    neg-int v1, v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v11, v2

    if-eqz v13, :cond_257

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v3

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v8

    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v5, v3, v8, v2, v4}, Landroid/widget/TextView;->layout(IIII)V

    iget v5, v0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    add-int/2addr v2, v5

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v8, v4, v1

    goto :goto_258

    :cond_257
    move v2, v3

    :goto_258
    if-eqz v14, :cond_27c

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v1

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, v3

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v8

    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v5, v3, v8, v1, v4}, Landroid/widget/TextView;->layout(IIII)V

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    add-int/2addr v1, v4

    goto :goto_27d

    :cond_27c
    move v1, v3

    :goto_27d
    if-eqz v17, :cond_284

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_285

    :cond_284
    move v2, v3

    :goto_285
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3}, Landroidx/appcompat/widget/Toolbar;->げつ〴ぬぐ(Ljava/util/List;I)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    const/4 v2, 0x0

    :goto_293
    if-ge v2, v1, :cond_2a6

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    move/from16 v12, p3

    invoke-virtual {v0, v4, v3, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_293

    :cond_2a6
    move/from16 v12, p3

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/Toolbar;->げつ〴ぬぐ(Ljava/util/List;I)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_2b5
    if-ge v2, v1, :cond_2c6

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v0, v4, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻(Landroid/view/View;I[II)I

    move-result v10

    add-int/lit8 v2, v2, 0x1

    goto :goto_2b5

    :cond_2c6
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/Toolbar;->げつ〴ぬぐ(Ljava/util/List;I)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    const/4 v4, 0x0

    .line 1
    aget v5, v11, v4

    aget v2, v11, v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_2da
    if-ge v5, v4, :cond_30d

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v13, v7

    iget v7, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v7, v2

    const/4 v2, 0x0

    invoke-static {v2, v13}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v14

    neg-int v13, v13

    invoke-static {v2, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    neg-int v7, v7

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v8, v9

    add-int/2addr v8, v14

    add-int/2addr v6, v8

    add-int/lit8 v5, v5, 0x1

    move v2, v7

    move v7, v13

    goto :goto_2da

    :cond_30d
    const/4 v2, 0x0

    sub-int v4, v16, v18

    sub-int v4, v4, p4

    .line 2
    div-int/lit8 v4, v4, 0x2

    add-int v4, v4, v18

    div-int/lit8 v1, v6, 0x2

    sub-int/2addr v4, v1

    add-int/2addr v6, v4

    if-ge v4, v3, :cond_31d

    goto :goto_324

    :cond_31d
    if-le v6, v10, :cond_323

    sub-int/2addr v6, v10

    sub-int v3, v4, v6

    goto :goto_324

    :cond_323
    move v3, v4

    :goto_324
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v3

    const/4 v3, 0x0

    :goto_32c
    if-ge v3, v1, :cond_33d

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v0, v4, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ(Landroid/view/View;I[II)I

    move-result v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_32c

    :cond_33d
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->じぜこほぱ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public onMeasure(II)V
    .registers 20

    move-object/from16 v7, p0

    iget-object v8, v7, Landroidx/appcompat/widget/Toolbar;->ぉひのべい:[I

    invoke-static/range {p0 .. p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_f

    const/4 v11, 0x1

    const/4 v12, 0x0

    goto :goto_11

    :cond_f
    const/4 v11, 0x0

    const/4 v12, 0x1

    :goto_11
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_53

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    const/4 v5, 0x0

    iget v6, v7, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ:I

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで(Landroid/view/View;IIIII)V

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->てぜきぽく(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v0

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v2}, Landroid/widget/ImageButton;->getMeasuredState()I

    move-result v2

    invoke-static {v10, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    move v13, v0

    move v14, v2

    goto :goto_56

    :cond_53
    const/4 v1, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_56
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_95

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    const/4 v5, 0x0

    iget v6, v7, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ:I

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで(Landroid/view/View;IIIII)V

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->てぜきぽく(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v0

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v13

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredState()I

    move-result v0

    invoke-static {v14, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v14

    :cond_95
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v15, v2, 0x0

    sub-int/2addr v0, v1

    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    aput v0, v8, v11

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_e6

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v5, 0x0

    iget v6, v7, Landroidx/appcompat/widget/Toolbar;->ぇぬぎばつ:I

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v3, v15

    move/from16 v4, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで(Landroid/view/View;IIIII)V

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->てぜきぽく(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v0

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v13

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredState()I

    move-result v0

    invoke-static {v14, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v14

    goto :goto_e7

    :cond_e6
    const/4 v1, 0x0

    :goto_e7
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int v11, v2, v15

    sub-int/2addr v0, v1

    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    aput v0, v8, v12

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_12b

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v3, v11

    move/from16 v4, p2

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺(Landroid/view/View;IIII[I)I

    move-result v0

    add-int/2addr v11, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v13

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    invoke-static {v14, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v14

    :cond_12b
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_15e

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v3, v11

    move/from16 v4, p2

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺(Landroid/view/View;IIII[I)I

    move-result v0

    add-int/2addr v11, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v13

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredState()I

    move-result v0

    invoke-static {v14, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v14

    :cond_15e
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/4 v15, 0x0

    :goto_163
    if-ge v15, v12, :cond_1a7

    invoke-virtual {v7, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v0, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    if-nez v0, :cond_1a4

    invoke-virtual {v7, v6}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_17a

    goto :goto_1a4

    :cond_17a
    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v1, v6

    move/from16 v2, p1

    move v3, v11

    move/from16 v4, p2

    move-object/from16 v16, v6

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺(Landroid/view/View;IIII[I)I

    move-result v0

    add-int/2addr v11, v0

    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    invoke-static {v14, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v1

    move v13, v0

    move v14, v1

    :cond_1a4
    :goto_1a4
    add-int/lit8 v15, v15, 0x1

    goto :goto_163

    :cond_1a7
    iget v0, v7, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    iget v1, v7, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    add-int v12, v0, v1

    iget v0, v7, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    iget v1, v7, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    add-int v15, v0, v1

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1f3

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    add-int v3, v11, v15

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    move v5, v12

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺(Landroid/view/View;IIII[I)I

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->てぜきぽく(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I

    move-result v0

    invoke-static {v14, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v14

    move/from16 v16, v2

    move v6, v14

    move v14, v1

    goto :goto_1f7

    :cond_1f3
    move v6, v14

    const/4 v14, 0x0

    const/16 v16, 0x0

    :goto_1f7
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_22f

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    add-int v3, v11, v15

    add-int v5, v16, v12

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    move v12, v6

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺(Landroid/view/View;IIII[I)I

    move-result v0

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v14

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->のぷのちつ(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    add-int v16, v1, v16

    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I

    move-result v0

    invoke-static {v12, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v6

    goto :goto_230

    :cond_22f
    move v12, v6

    :goto_230
    move/from16 v0, v16

    add-int/2addr v11, v14

    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v1, -0x1000000

    and-int/2addr v1, v6

    move/from16 v2, p1

    invoke-static {v0, v2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    shl-int/lit8 v2, v6, 0x10

    move/from16 v3, p2

    invoke-static {v1, v3, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    .line 1
    iget-boolean v2, v7, Landroidx/appcompat/widget/Toolbar;->ながふずは:Z

    if-nez v2, :cond_272

    :goto_270
    const/4 v9, 0x0

    goto :goto_293

    :cond_272
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_277
    if-ge v3, v2, :cond_293

    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v7, v4}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_290

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    if-lez v5, :cond_290

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    if-lez v4, :cond_290

    goto :goto_270

    :cond_290
    add-int/lit8 v3, v3, 0x1

    goto :goto_277

    :cond_293
    :goto_293
    if-eqz v9, :cond_296

    goto :goto_297

    :cond_296
    move v10, v1

    .line 2
    :goto_297
    invoke-virtual {v7, v0, v10}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 5

    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Landroidx/appcompat/widget/Toolbar$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_16

    .line 3
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    .line 4
    :goto_17
    iget v1, p1, Landroidx/appcompat/widget/Toolbar$SavedState;->びぐびあび:I

    if-eqz v1, :cond_2a

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-eqz v2, :cond_2a

    if-eqz v0, :cond_2a

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-interface {v0}, Landroid/view/MenuItem;->expandActionView()Z

    :cond_2a
    iget-boolean p1, p1, Landroidx/appcompat/widget/Toolbar$SavedState;->づざかべべ:Z

    if-eqz p1, :cond_38

    .line 5
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぃぜぶの〸ぃ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぃぜぶの〸ぃ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_38
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_9

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRtlPropertiesChanged(I)V

    :cond_9
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->びぐびあび()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    const/4 v1, 0x1

    if-ne p1, v1, :cond_12

    goto :goto_13

    :cond_12
    const/4 v1, 0x0

    .line 1
    :goto_13
    iget-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    if-ne v1, p1, :cond_18

    goto :goto_46

    :cond_18
    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    iget-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〳ぜぞぜべっ:Z

    if-eqz p1, :cond_3e

    const/high16 p1, -0x80000000

    if-eqz v1, :cond_30

    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->びぐびあび:I

    if-eq v1, p1, :cond_27

    goto :goto_29

    :cond_27
    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->づざかべべ:I

    :goto_29
    iput v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->くし〴〺ぅ:I

    if-eq v1, p1, :cond_42

    goto :goto_44

    :cond_30
    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->くし〴〺ぅ:I

    if-eq v1, p1, :cond_35

    goto :goto_37

    :cond_35
    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->づざかべべ:I

    :goto_37
    iput v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->びぐびあび:I

    if-eq v1, p1, :cond_42

    goto :goto_44

    :cond_3e
    iget p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->づざかべべ:I

    iput p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    :cond_42
    iget v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->なぎぱいぢぎ:I

    :goto_44
    iput v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    :goto_46
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/Toolbar$SavedState;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/Toolbar$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-eqz v1, :cond_15

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-eqz v1, :cond_15

    .line 1
    iget v1, v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->げつ〴ぬぐ:I

    .line 2
    iput v1, v0, Landroidx/appcompat/widget/Toolbar$SavedState;->びぐびあび:I

    :cond_15
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず()Z

    move-result v1

    iput-boolean v1, v0, Landroidx/appcompat/widget/Toolbar$SavedState;->づざかべべ:Z

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->どぇぞほだ:Z

    :cond_9
    iget-boolean v2, p0, Landroidx/appcompat/widget/Toolbar;->どぇぞほだ:Z

    const/4 v3, 0x1

    if-nez v2, :cond_18

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_18

    if-nez p1, :cond_18

    iput-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->どぇぞほだ:Z

    :cond_18
    if-eq v0, v3, :cond_1d

    const/4 p1, 0x3

    if-ne v0, p1, :cond_1f

    :cond_1d
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->どぇぞほだ:Z

    :cond_1f
    return v3
.end method

.method public setCollapseContentDescription(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCollapseContentDescription(Ljava/lang/CharSequence;)V
    .registers 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ()V

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public setCollapseIcon(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCollapseIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_14

    :cond_b
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    if-eqz p1, :cond_14

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_14
    :goto_14
    return-void
.end method

.method public setCollapsible(Z)V
    .registers 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar;->ながふずは:Z

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setContentInsetEndWithActions(I)V
    .registers 3

    if-gez p1, :cond_4

    const/high16 p1, -0x80000000

    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->ぶでにく〼〳:I

    if-eq p1, v0, :cond_13

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぶでにく〼〳:I

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_13
    return-void
.end method

.method public setContentInsetStartWithNavigation(I)V
    .registers 3

    if-gez p1, :cond_4

    const/high16 p1, -0x80000000

    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->でどあくず:I

    if-eq p1, v0, :cond_13

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->でどあくず:I

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_13
    return-void
.end method

.method public setContentInsetsAbsolute(II)V
    .registers 5

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->びぐびあび()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    const/4 v1, 0x0

    .line 1
    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〳ぜぞぜべっ:Z

    const/high16 v1, -0x80000000

    if-eq p1, v1, :cond_10

    iput p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->づざかべべ:I

    iput p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    :cond_10
    if-eq p2, v1, :cond_16

    iput p2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->なぎぱいぢぎ:I

    iput p2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    :cond_16
    return-void
.end method

.method public setContentInsetsRelative(II)V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->びぐびあび()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ(II)V

    return-void
.end method

.method public setLogo(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    if-eqz p1, :cond_20

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-nez v0, :cond_11

    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    .line 2
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_36

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->〺つふすそ(Landroid/view/View;Z)V

    goto :goto_36

    :cond_20
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-eqz v0, :cond_36

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_36

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_36
    :goto_36
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-eqz v0, :cond_3d

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3d
    return-void
.end method

.method public setLogoDescription(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLogoDescription(Ljava/lang/CharSequence;)V
    .registers 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-nez v0, :cond_15

    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    .line 2
    :cond_15
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ:Landroid/widget/ImageView;

    if-eqz v0, :cond_1c

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1c
    return-void
.end method

.method public setMenu(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 7

    if-nez p1, :cond_7

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-nez v0, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-ne v0, p1, :cond_11

    return-void

    :cond_11
    if-eqz v0, :cond_1d

    .line 2
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->おかぷせ〱:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;)V

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;)V

    :cond_1d
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-nez v0, :cond_28

    new-instance v0, Landroidx/appcompat/widget/Toolbar$びぐびあび;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$びぐびあび;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    :cond_28
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p2, Landroidx/appcompat/widget/ActionMenuPresenter;->は〲ぱなで:Z

    if-eqz p1, :cond_3a

    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    invoke-virtual {p1, p2, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    invoke-virtual {p1, v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    goto :goto_57

    :cond_3a
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1}, Landroidx/appcompat/widget/ActionMenuPresenter;->くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    .line 5
    iget-object v2, p1, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v2, :cond_4d

    iget-object v3, p1, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-eqz v3, :cond_4d

    invoke-virtual {v2, v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z

    :cond_4d
    iput-object v1, p1, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 6
    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->ぁごぐすすぃ(Z)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar$びぐびあび;->ぁごぐすすぃ(Z)V

    :goto_57
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->てぜきぽく:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar;->おかぷせ〱:Landroidx/appcompat/widget/ActionMenuPresenter;

    return-void
.end method

.method public setMenuCallbacks(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぇとしたべど:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar;->げがぴうあだ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->setMenuCallbacks(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V

    :cond_b
    return-void
.end method

.method public setNavigationContentDescription(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setNavigationContentDescription(Ljava/lang/CharSequence;)V
    .registers 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ぁごぐすすぃ()V

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public setNavigationIcon(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    if-eqz p1, :cond_14

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ぁごぐすすぃ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2a

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->〺つふすそ(Landroid/view/View;Z)V

    goto :goto_2a

    :cond_14
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2a

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2a

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2a
    :goto_2a
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_31

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_31
    return-void
.end method

.method public setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ぁごぐすすぃ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$づざかべべ;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->せづっ〸ちね:Landroidx/appcompat/widget/Toolbar$づざかべべ;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->づざかべべ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPopupTheme(I)V
    .registers 4

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->てぜきぽく:I

    if-eq v0, p1, :cond_1a

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->てぜきぽく:I

    if-nez p1, :cond_f

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    goto :goto_1a

    :cond_f
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    :cond_1a
    :goto_1a
    return-void
.end method

.method public setSubtitle(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .registers 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_40

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    if-nez v0, :cond_31

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ:I

    if-eqz v1, :cond_28

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_28
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->なぶひせが:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_31

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_31
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_56

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->〺つふすそ(Landroid/view/View;Z)V

    goto :goto_56

    :cond_40
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    if-eqz v0, :cond_56

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_56

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_56
    :goto_56
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    if-eqz v0, :cond_5d

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5d
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぇ〳〲〺すっ:Ljava/lang/CharSequence;

    return-void
.end method

.method public setSubtitleTextAppearance(Landroid/content/Context;I)V
    .registers 4

    iput p2, p0, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ:I

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_9
    return-void
.end method

.method public setSubtitleTextColor(I)V
    .registers 2

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setSubtitleTextColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->なぶひせが:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びぐびあび:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    return-void
.end method

.method public setTitle(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_40

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    if-nez v0, :cond_31

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->のぷのちつ:I

    if-eqz v1, :cond_28

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_28
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->びえぁぜい:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_31

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_31
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_56

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->〺つふすそ(Landroid/view/View;Z)V

    goto :goto_56

    :cond_40
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_56

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->へぬ〴づぞ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_56

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_56
    :goto_56
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_5d

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5d
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ぉ〲なぱぽた:Ljava/lang/CharSequence;

    return-void
.end method

.method public setTitleMargin(IIII)V
    .registers 5

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    iput p2, p0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    iput p3, p0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    iput p4, p0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setTitleMarginBottom(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ごづごきえ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setTitleMarginEnd(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ざとぅぼこ〺:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setTitleMarginStart(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ぉざぅち〻:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setTitleMarginTop(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->は〲ぱなで:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setTitleTextAppearance(Landroid/content/Context;I)V
    .registers 4

    iput p2, p0, Landroidx/appcompat/widget/Toolbar;->のぷのちつ:I

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_9
    return-void
.end method

.method public setTitleTextColor(I)V
    .registers 2

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTitleTextColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->びえぁぜい:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    return-void
.end method

.method public 〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public final 〺つふすそ(Landroid/view/View;Z)V
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    goto :goto_18

    :cond_b
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v1

    if-nez v1, :cond_16

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    goto :goto_18

    :cond_16
    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    :goto_18
    const/4 v1, 0x1

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    if-eqz p2, :cond_2a

    iget-object p2, p0, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    if-eqz p2, :cond_2a

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    :cond_2a
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_2d
    return-void
.end method

.method public final ぁごぐすすぃ()V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    if-nez v0, :cond_25

    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->toolbarNavigationButtonStyle:I

    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    const v1, 0x800003

    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず:I

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->づざかべべ:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_25
    return-void
.end method

.method public final いいにぽつ(I)I
    .registers 6

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result p1

    and-int/lit8 p1, p1, 0x7

    const/4 v1, 0x1

    if-eq p1, v1, :cond_17

    const/4 v2, 0x3

    if-eq p1, v2, :cond_17

    const/4 v3, 0x5

    if-eq p1, v3, :cond_17

    if-ne v0, v1, :cond_16

    const/4 v2, 0x5

    :cond_16
    return v2

    :cond_17
    return p1
.end method

.method public final ぇぬぎばつ(Landroid/view/View;I[II)I
    .registers 9

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v2, 0x0

    aget v3, p3, v2

    sub-int/2addr v1, v3

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, p2

    neg-int p2, v1

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    aput p2, p3, v2

    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺(Landroid/view/View;I)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    add-int p4, v3, p3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {p1, v3, p2, p4, v1}, Landroid/view/View;->layout(IIII)V

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p3, p1

    add-int/2addr p3, v3

    return p3
.end method

.method public final ぉざぅち〻(Landroid/view/View;I[II)I
    .registers 10

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v2, 0x1

    aget v3, p3, v2

    sub-int/2addr v1, v3

    const/4 v3, 0x0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    sub-int/2addr p2, v4

    neg-int v1, v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p3, v2

    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺(Landroid/view/View;I)I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    sub-int v1, p2, p4

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {p1, v1, p3, p2, v2}, Landroid/view/View;->layout(IIII)V

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p4, p1

    sub-int/2addr p2, p4

    return p2
.end method

.method public おぐぴう〸ず()Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず()Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_16

    goto :goto_17

    :cond_16
    const/4 v1, 0x0

    :goto_17
    return v1
.end method

.method public くし〴〺ぅ()V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    if-nez v0, :cond_3e

    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->toolbarNavigationButtonStyle:I

    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    const v1, 0x800003

    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず:I

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    const/4 v1, 0x2

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    new-instance v1, Landroidx/appcompat/widget/Toolbar$くし〴〺ぅ;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/Toolbar$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3e
    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/util/List;I)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v4

    invoke-static {p2, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_41

    sub-int/2addr v3, v2

    :goto_1d
    if-ltz v3, :cond_65

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v2, v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    if-nez v2, :cond_3e

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_3e

    iget v1, v1, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->いいにぽつ(I)I

    move-result v1

    if-ne v1, p2, :cond_3e

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3e
    add-int/lit8 v3, v3, -0x1

    goto :goto_1d

    :cond_41
    :goto_41
    if-ge v1, v3, :cond_65

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v4, v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    if-nez v4, :cond_62

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ごづごきえ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_62

    iget v2, v2, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/Toolbar;->いいにぽつ(I)I

    move-result v2

    if-ne v2, p2, :cond_62

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_62
    add-int/lit8 v1, v1, 0x1

    goto :goto_41

    :cond_65
    return-void
.end method

.method public final ごづごきえ(Landroid/view/View;)Z
    .registers 3

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_12

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_12

    const/4 p1, 0x1

    goto :goto_13

    :cond_12
    const/4 p1, 0x0

    :goto_13
    return p1
.end method

.method public ざっざへづ()Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇぬぎばつ()Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_16

    goto :goto_17

    :cond_16
    const/4 v1, 0x0

    :goto_17
    return v1
.end method

.method public final ざとぅぼこ〺(Landroid/view/View;IIII[I)I
    .registers 14

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v2, 0x0

    aget v3, p6, v2

    sub-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v4, 0x1

    aget v5, p6, v4

    sub-int/2addr v3, v5

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/2addr v6, v5

    neg-int v1, v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p6, v2

    neg-int v1, v3

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p6, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, p6

    add-int/2addr v1, v6

    add-int/2addr v1, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {p2, v1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p6

    add-int/2addr p6, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p6, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p6, p3

    add-int/2addr p6, p5

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p4, p6, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    add-int/2addr p1, v6

    return p1
.end method

.method public final づざかべべ()V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->なぎぱいぢぎ()V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    .line 1
    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-nez v1, :cond_27

    .line 2
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-nez v1, :cond_1a

    new-instance v1, Landroidx/appcompat/widget/Toolbar$びぐびあび;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/Toolbar$びぐびあび;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    :cond_1a
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->setExpandedActionViewsExclusive(Z)V

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ぺふねづ〺:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    :cond_27
    return-void
.end method

.method public final てぜきぽく(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->おかぷせ〱(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v0

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->けときぜと(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public final なぎぱいぢぎ()V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-nez v0, :cond_3d

    new-instance v0, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->てぜきぽく:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ぷぞてのほき:Landroidx/appcompat/widget/ActionMenuView$びぐびあび;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setOnMenuItemClickListener(Landroidx/appcompat/widget/ActionMenuView$びぐびあび;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ぇとしたべど:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->げがぴうあだ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->setMenuCallbacks(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    const v1, 0x800005

    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず:I

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->〺つふすそ(Landroid/view/View;Z)V

    :cond_3d
    return-void
.end method

.method public final のぷのちつ(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, p1

    return v0
.end method

.method public final は〲ぱなで(Landroid/view/View;IIIII)V
    .registers 10

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    add-int/2addr v2, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v1

    add-int/2addr v2, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {p2, v2, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, p3

    add-int/2addr v1, p5

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p4, v1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p3

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p4

    const/high16 p5, 0x40000000    # 2.0f

    if-eq p4, p5, :cond_4a

    if-ltz p6, :cond_4a

    if-eqz p4, :cond_46

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    invoke-static {p3, p6}, Ljava/lang/Math;->min(II)I

    move-result p6

    :cond_46
    invoke-static {p6, p5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    :cond_4a
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final びぐびあび()V
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    invoke-direct {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ざっざへづ:Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;

    :cond_b
    return-void
.end method

.method public final へぬ〴づぞ(Landroid/view/View;)Z
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_11

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

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

.method public ぺぁあねじ(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$LayoutParams;
    .registers 3

    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz v0, :cond_c

    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    check-cast p1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroidx/appcompat/widget/Toolbar$LayoutParams;)V

    return-object v0

    :cond_c
    instance-of v0, p1, Landroidx/appcompat/app/ActionBar$LayoutParams;

    if-eqz v0, :cond_18

    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    check-cast p1, Landroidx/appcompat/app/ActionBar$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroidx/appcompat/app/ActionBar$LayoutParams;)V

    return-object v0

    :cond_18
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_24

    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_24
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final ぺふねづ〺(Landroid/view/View;I)I
    .registers 9

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_12

    sub-int p2, p1, p2

    div-int/lit8 p2, p2, 0x2

    goto :goto_13

    :cond_12
    const/4 p2, 0x0

    :goto_13
    iget v2, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    and-int/lit8 v2, v2, 0x70

    const/16 v3, 0x10

    const/16 v4, 0x50

    const/16 v5, 0x30

    if-eq v2, v3, :cond_27

    if-eq v2, v5, :cond_27

    if-eq v2, v4, :cond_27

    .line 1
    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->〻ぞまぎな〻:I

    and-int/lit8 v2, v2, 0x70

    :cond_27
    if-eq v2, v5, :cond_62

    if-eq v2, v4, :cond_53

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    sub-int v4, v3, p2

    sub-int/2addr v4, v2

    sub-int/2addr v4, p1

    div-int/lit8 v4, v4, 0x2

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ge v4, v5, :cond_43

    move v4, v5

    goto :goto_51

    :cond_43
    sub-int/2addr v3, v2

    sub-int/2addr v3, p1

    sub-int/2addr v3, v4

    sub-int/2addr v3, p2

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    if-ge v3, p1, :cond_51

    sub-int/2addr p1, v3

    sub-int/2addr v4, p1

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_51
    :goto_51
    add-int/2addr p2, v4

    return p2

    :cond_53
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    return v1

    :cond_62
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p1

    sub-int/2addr p1, p2

    return p1
.end method
