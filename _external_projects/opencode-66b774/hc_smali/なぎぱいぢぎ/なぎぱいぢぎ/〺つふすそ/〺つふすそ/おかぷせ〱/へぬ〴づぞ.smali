.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〳ぜぞぜべっ:F

.field public final 〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

.field public ぁごぐすすぃ:Landroid/animation/Animator;

.field public いいにぽつ:I

.field public ぇぬぎばつ:Landroid/content/res/ColorStateList;

.field public ぉざぅち〻:Ljava/lang/CharSequence;

.field public おぐぴう〸ず:I

.field public くし〴〺ぅ:Landroid/widget/LinearLayout;

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public ごづごきえ:I

.field public ざっざへづ:Landroid/content/res/ColorStateList;

.field public ざとぅぼこ〺:Z

.field public づざかべべ:Landroid/widget/FrameLayout;

.field public てぜきぽく:Z

.field public でどあくず:Landroid/graphics/Typeface;

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Landroid/widget/TextView;

.field public は〲ぱなで:Landroid/widget/TextView;

.field public びぐびあび:I

.field public へぬ〴づぞ:Ljava/lang/CharSequence;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->げつ〴ぬぐ:Landroid/content/Context;

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_textinput_caption_translate_y:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〳ぜぞぜべっ:F

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()V
    .registers 5

    const/4 v0, 0x0

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ()V

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺぁあねじ:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1c

    iget-boolean v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ざとぅぼこ〺:Z

    if-eqz v1, :cond_19

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぉざぅち〻:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_19

    const/4 v1, 0x2

    goto :goto_1a

    :cond_19
    const/4 v1, 0x0

    :goto_1a
    iput v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->いいにぽつ:I

    :cond_1c
    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺぁあねじ:I

    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->いいにぽつ:I

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->のぷのちつ:Landroid/widget/TextView;

    invoke-virtual {p0, v3, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->いいにぽつ(Landroid/widget/TextView;Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-virtual {p0, v1, v2, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺふねづ〺(IIZ)V

    return-void
.end method

.method public 〺つふすそ()V
    .registers 5

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    if-eqz v0, :cond_2b

    .line 2
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->は〲ぱなで(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ざとぅぼこ〺(Landroid/view/View;)I

    move-result v3

    invoke-static {v0, v2, v1, v3, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->えがぐせほち(Landroid/view/View;IIII)V

    :cond_2b
    return-void
.end method

.method public ぁごぐすすぃ()I
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->のぷのちつ:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, -0x1

    :goto_a
    return v0
.end method

.method public final いいにぽつ(Landroid/widget/TextView;Ljava/lang/CharSequence;)Z
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_24

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->いいにぽつ:I

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺぁあねじ:I

    if-ne v0, v1, :cond_22

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_24

    :cond_22
    const/4 p1, 0x1

    goto :goto_25

    :cond_24
    const/4 p1, 0x0

    :goto_25
    return p1
.end method

.method public くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぁごぐすすぃ:Landroid/animation/Animator;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_7
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/widget/TextView;I)V
    .registers 8

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, -0x2

    if-nez v0, :cond_40

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    if-nez v0, :cond_40

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    const/4 v4, -0x1

    invoke-virtual {v0, v3, v4, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v4, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_40

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ()V

    :cond_40
    const/4 v0, 0x1

    if-eqz p2, :cond_48

    if-ne p2, v0, :cond_46

    goto :goto_48

    :cond_46
    const/4 p2, 0x0

    goto :goto_49

    :cond_48
    :goto_48
    const/4 p2, 0x1

    :goto_49
    if-eqz p2, :cond_5b

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    invoke-virtual {p2, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ:I

    add-int/2addr p1, v0

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ:I

    goto :goto_65

    :cond_5b
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {v2, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_65
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->びぐびあび:I

    add-int/2addr p1, v0

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->びぐびあび:I

    return-void
.end method

.method public づざかべべ()Z
    .registers 3

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->いいにぽつ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_12

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->のぷのちつ:Landroid/widget/TextView;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_13

    :cond_12
    const/4 v1, 0x0

    :goto_13
    return v1
.end method

.method public final なぎぱいぢぎ(I)Landroid/widget/TextView;
    .registers 3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_b

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 p1, 0x0

    return-object p1

    :cond_8
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->は〲ぱなで:Landroid/widget/TextView;

    return-object p1

    :cond_b
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->のぷのちつ:Landroid/widget/TextView;

    return-object p1
.end method

.method public final びぐびあび(Ljava/util/List;ZLandroid/widget/TextView;III)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;Z",
            "Landroid/widget/TextView;",
            "III)V"
        }
    .end annotation

    if-eqz p3, :cond_4d

    if-nez p2, :cond_5

    goto :goto_4d

    :cond_5
    if-eq p4, p6, :cond_9

    if-ne p4, p5, :cond_4d

    :cond_9
    const/4 p2, 0x0

    const/4 p5, 0x1

    if-ne p6, p4, :cond_f

    const/4 v0, 0x1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    const/4 v1, 0x0

    if-eqz v0, :cond_16

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    .line 1
    :goto_17
    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, p5, [F

    aput v0, v3, p2

    invoke-static {p3, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0xa7

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v2}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ne p6, p4, :cond_4d

    .line 3
    sget-object p4, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    const/4 p6, 0x2

    new-array p6, p6, [F

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〳ぜぞぜべっ:F

    neg-float v0, v0

    aput v0, p6, p2

    aput v1, p6, p5

    invoke-static {p3, p4, p6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-wide/16 p3, 0xd9

    invoke-virtual {p2, p3, p4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->びぐびあび:Landroid/animation/TimeInterpolator;

    invoke-virtual {p2, p3}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 4
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4d
    :goto_4d
    return-void
.end method

.method public ぺぁあねじ(Landroid/widget/TextView;I)V
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v1, 0x1

    if-eqz p2, :cond_d

    if-ne p2, v1, :cond_b

    goto :goto_d

    :cond_b
    const/4 p2, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 p2, 0x1

    :goto_e
    const/16 v2, 0x8

    if-eqz p2, :cond_26

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    if-eqz p2, :cond_26

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ:I

    sub-int/2addr v0, v1

    iput v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ:I

    if-nez v0, :cond_20

    .line 1
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    :cond_20
    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->づざかべべ:Landroid/widget/FrameLayout;

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    goto :goto_29

    :cond_26
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :goto_29
    iget p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->びぐびあび:I

    sub-int/2addr p1, v1

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->びぐびあび:I

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->くし〴〺ぅ:Landroid/widget/LinearLayout;

    if-nez p1, :cond_35

    .line 3
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_35
    return-void
.end method

.method public final ぺふねづ〺(IIZ)V
    .registers 18

    move-object v7, p0

    move v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    if-ne v8, v9, :cond_9

    return-void

    :cond_9
    const/4 v11, 0x0

    if-eqz v10, :cond_49

    new-instance v12, Landroid/animation/AnimatorSet;

    invoke-direct {v12}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v12, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぁごぐすすぃ:Landroid/animation/Animator;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ざとぅぼこ〺:Z

    iget-object v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->は〲ぱなで:Landroid/widget/TextView;

    const/4 v4, 0x2

    move-object v0, p0

    move-object v1, v13

    move v5, p1

    move/from16 v6, p2

    invoke-virtual/range {v0 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->びぐびあび(Ljava/util/List;ZLandroid/widget/TextView;III)V

    iget-boolean v2, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->てぜきぽく:Z

    iget-object v3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->のぷのちつ:Landroid/widget/TextView;

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->びぐびあび(Ljava/util/List;ZLandroid/widget/TextView;III)V

    invoke-static {v12, v13}, Lづざかべべ/は〲ぱなで/〺つふすそ;->きぬどぼみ〸(Landroid/animation/AnimatorSet;Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ(I)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ(I)Landroid/widget/TextView;

    move-result-object v5

    new-instance v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ$げつ〴ぬぐ;

    move-object v0, v6

    move-object v1, p0

    move/from16 v2, p2

    move v4, p1

    invoke-direct/range {v0 .. v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;ILandroid/widget/TextView;ILandroid/widget/TextView;)V

    invoke-virtual {v12, v6}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v12}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_71

    :cond_49
    if-ne v8, v9, :cond_4c

    goto :goto_71

    :cond_4c
    if-eqz v9, :cond_5c

    .line 1
    invoke-virtual {p0, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_5c

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setVisibility(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    :cond_5c
    if-eqz v8, :cond_6f

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->なぎぱいぢぎ(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_6f

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v1, 0x1

    if-ne v8, v1, :cond_6f

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6f
    iput v9, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->ぺぁあねじ:I

    .line 2
    :goto_71
    iget-object v0, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->ぶでにく〼〳()V

    iget-object v0, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 3
    invoke-virtual {v0, v10, v11}, Lcom/google/android/material/textfield/TextInputLayout;->ぇ〳〲〺すっ(ZZ)V

    .line 4
    iget-object v0, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/へぬ〴づぞ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->ぉひのべい()V

    return-void
.end method
