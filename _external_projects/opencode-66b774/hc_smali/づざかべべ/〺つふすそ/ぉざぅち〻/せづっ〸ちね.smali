.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

.field public いいにぽつ:Ljava/lang/CharSequence;

.field public ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

.field public おぐぴう〸ず:I

.field public くし〴〺ぅ:Landroid/view/View;

.field public げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

.field public づざかべべ:Landroid/graphics/drawable/Drawable;

.field public てぜきぽく:Landroid/view/Window$Callback;

.field public なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

.field public のぷのちつ:Z

.field public びぐびあび:Landroid/view/View;

.field public へぬ〴づぞ:Landroidx/appcompat/widget/ActionMenuPresenter;

.field public ぺぁあねじ:Ljava/lang/CharSequence;

.field public ぺふねづ〺:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Z)V
    .registers 8

    sget v0, Lづざかべべ/〺つふすそ/〳ぜぞぜべっ;->abc_action_bar_up_description:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->おぐぴう〸ず:I

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺぁあねじ:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->いいにぽつ:Ljava/lang/CharSequence;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺぁあねじ:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_1d

    :cond_1c
    const/4 v2, 0x0

    :goto_1d
    iput-boolean v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〳ぜぞぜべっ:Z

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v2, 0x0

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar:[I

    sget v4, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarStyle:I

    invoke-static {p1, v2, v3, v4, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ざとぅぼこ〺(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object p1

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_homeAsUpIndicator:I

    invoke-virtual {p1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_134

    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_title:I

    invoke-virtual {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4b

    invoke-virtual {p0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->setTitle(Ljava/lang/CharSequence;)V

    :cond_4b
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_subtitle:I

    invoke-virtual {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_64

    .line 2
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->いいにぽつ:Ljava/lang/CharSequence;

    iget v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_64

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2, p2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 3
    :cond_64
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_logo:I

    invoke-virtual {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_71

    .line 4
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぉ〲なぱぽた()V

    .line 5
    :cond_71
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_icon:I

    invoke-virtual {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_7e

    .line 6
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぉ〲なぱぽた()V

    .line 7
    :cond_7e
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_8b

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_8b

    .line 8
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〻ぞまぎな〻()V

    .line 9
    :cond_8b
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_displayOptions:I

    invoke-virtual {p1, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->てぜきぽく(I)V

    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_customNavigationLayout:I

    invoke-virtual {p1, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p2

    if-eqz p2, :cond_d1

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2, p2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 10
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->びぐびあび:Landroid/view/View;

    if-eqz v2, :cond_bb

    iget v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v3, v3, 0x10

    if-eqz v3, :cond_bb

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_bb
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->びぐびあび:Landroid/view/View;

    if-eqz p2, :cond_ca

    iget v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_ca

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    :cond_ca
    iget p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    or-int/lit8 p2, p2, 0x10

    invoke-virtual {p0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->てぜきぽく(I)V

    :cond_d1
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_height:I

    invoke-virtual {p1, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->てぜきぽく(II)I

    move-result p2

    if-lez p2, :cond_e6

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput p2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_e6
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_contentInsetStart:I

    const/4 v2, -0x1

    invoke-virtual {p1, p2, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result p2

    sget v3, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_contentInsetEnd:I

    invoke-virtual {p1, v3, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->づざかべべ(II)I

    move-result v2

    if-gez p2, :cond_f7

    if-ltz v2, :cond_104

    :cond_f7
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v3, p2, v2}, Landroidx/appcompat/widget/Toolbar;->setContentInsetsRelative(II)V

    :cond_104
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_titleTextStyle:I

    invoke-virtual {p1, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p2

    if-eqz p2, :cond_115

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, p2}, Landroidx/appcompat/widget/Toolbar;->setTitleTextAppearance(Landroid/content/Context;I)V

    :cond_115
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_subtitleTextStyle:I

    invoke-virtual {p1, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p2

    if-eqz p2, :cond_126

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, p2}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextAppearance(Landroid/content/Context;I)V

    :cond_126
    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_popupTheme:I

    invoke-virtual {p1, p2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result p2

    if-eqz p2, :cond_14b

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, p2}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    goto :goto_14b

    .line 12
    :cond_134
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p2}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_147

    const/16 p2, 0xf

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    goto :goto_149

    :cond_147
    const/16 p2, 0xb

    .line 13
    :goto_149
    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    .line 14
    :cond_14b
    :goto_14b
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    iget p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->おぐぴう〸ず:I

    if-ne v0, p1, :cond_155

    goto :goto_168

    :cond_155
    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->おぐぴう〸ず:I

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_168

    iget p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->おぐぴう〸ず:I

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぇぬぎばつ(I)V

    .line 16
    :cond_168
    :goto_168
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺふねづ〺:Ljava/lang/CharSequence;

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    new-instance p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;

    invoke-direct {p2, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public collapseActionView()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_a

    :cond_8
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    :goto_a
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->collapseActionView()Z

    :cond_f
    return-void
.end method

.method public getContext()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public setIcon(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 1
    :goto_c
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぉ〲なぱぽた()V

    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->づざかべべ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぉ〲なぱぽた()V

    return-void
.end method

.method public setMenu(Landroid/view/Menu;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->へぬ〴づぞ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-nez v0, :cond_15

    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->へぬ〴づぞ:Landroidx/appcompat/widget/ActionMenuPresenter;

    sget v1, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_menu_presenter:I

    .line 1
    iput v1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->いいにぽつ:I

    .line 2
    :cond_15
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->へぬ〴づぞ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 3
    iput-object p2, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    .line 4
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {p2, p1, v0}, Landroidx/appcompat/widget/Toolbar;->setMenu(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroidx/appcompat/widget/ActionMenuPresenter;)V

    return-void
.end method

.method public setMenuPrepared()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->のぷのちつ:Z

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〳ぜぞぜべっ:Z

    .line 1
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺぁあねじ:Ljava/lang/CharSequence;

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_10

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public setVisibility(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->てぜきぽく:Landroid/view/Window$Callback;

    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_11

    .line 1
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺぁあねじ:Ljava/lang/CharSequence;

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_11

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_11
    return-void
.end method

.method public 〳ぜぞぜべっ(Landroidx/appcompat/widget/ScrollingTabContainerView;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->くし〴〺ぅ:Landroid/view/View;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    if-ne p1, v0, :cond_11

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_11
    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->くし〴〺ぅ:Landroid/view/View;

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_22

    .line 2
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_1e

    .line 3
    iget-object v3, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    if-nez v3, :cond_19

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_19

    :cond_17
    const/4 v0, 0x0

    goto :goto_1a

    :cond_19
    :goto_19
    const/4 v0, 0x1

    :goto_1a
    if-eqz v0, :cond_1e

    const/4 v0, 0x1

    goto :goto_1f

    :cond_1e
    const/4 v0, 0x0

    :goto_1f
    if-eqz v0, :cond_22

    const/4 v1, 0x1

    :cond_22
    return v1
.end method

.method public final 〻ぞまぎな〻()V
    .registers 3

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_10

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_d

    goto :goto_13

    :cond_d
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    goto :goto_13

    :cond_10
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    :goto_13
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ぁごぐすすぃ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/Toolbar;->setMenuCallbacks(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V

    return-void
.end method

.method public いいにぽつ(Z)V
    .registers 2

    return-void
.end method

.method public ぇぬぎばつ(I)V
    .registers 3

    if-nez p1, :cond_4

    const/4 p1, 0x0

    goto :goto_c

    :cond_4
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    :goto_c
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぶでにく〼〳()V

    return-void
.end method

.method public final ぉ〲なぱぽた()V
    .registers 3

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_12

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_f

    goto :goto_13

    :cond_f
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->づざかべべ:Landroid/graphics/drawable/Drawable;

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ぉざぅち〻()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public おぐぴう〸ず(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 1
    :goto_c
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぉ〲なぱぽた()V

    return-void
.end method

.method public くし〴〺ぅ()Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_18

    .line 2
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ()Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 v0, 0x1

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    if-eqz v0, :cond_18

    const/4 v1, 0x1

    :cond_18
    return v1
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず()Z

    move-result v0

    return v0
.end method

.method public ごづごきえ()V
    .registers 1

    return-void
.end method

.method public ざっざへづ(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〻ぞまぎな〻()V

    return-void
.end method

.method public ざとぅぼこ〺(IJ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    move-result-object v0

    if-nez p1, :cond_b

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_b
    const/4 v1, 0x0

    :goto_c
    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ(F)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-virtual {v0, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->くし〴〺ぅ(J)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    new-instance p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;

    invoke-direct {p2, p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;I)V

    invoke-virtual {v0, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    return-object v0
.end method

.method public づざかべべ()Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v1

    if-nez v1, :cond_12

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_12

    .line 2
    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ごづごきえ:Z

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    return v0
.end method

.method public てぜきぽく(I)V
    .registers 5

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    xor-int/2addr v0, p1

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    if-eqz v0, :cond_52

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_15

    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_12

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぶでにく〼〳()V

    :cond_12
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〻ぞまぎな〻()V

    :cond_15
    and-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_1c

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぉ〲なぱぽた()V

    :cond_1c
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3b

    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_30

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺぁあねじ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->いいにぽつ:Ljava/lang/CharSequence;

    goto :goto_38

    :cond_30
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    :goto_38
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_3b
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_52

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->びぐびあび:Landroid/view/View;

    if-eqz v0, :cond_52

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_4d

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_52

    :cond_4d
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_52
    :goto_52
    return-void
.end method

.method public でどあくず(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_d

    .line 2
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->〺つふすそ()Z

    :cond_d
    return-void
.end method

.method public のぷのちつ()I
    .registers 2

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    return v0
.end method

.method public は〲ぱなで()V
    .registers 1

    return-void
.end method

.method public びぐびあび()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->ざっざへづ()Z

    move-result v0

    return v0
.end method

.method public final ぶでにく〼〳()V
    .registers 3

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->〺つふすそ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->おぐぴう〸ず:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    goto :goto_1d

    :cond_16
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    :cond_1d
    :goto_1d
    return-void
.end method

.method public へぬ〴づぞ()Landroid/view/Menu;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public ぺぁあねじ()Landroid/view/ViewGroup;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method public ぺふねづ〺()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-eqz v0, :cond_c

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method
