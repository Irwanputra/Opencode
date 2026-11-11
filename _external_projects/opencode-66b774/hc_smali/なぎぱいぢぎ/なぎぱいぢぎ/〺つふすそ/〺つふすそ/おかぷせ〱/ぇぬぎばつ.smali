.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;
.source ""


# instance fields
.field public final づざかべべ:Lcom/google/android/material/textfield/TextInputLayout$なぎぱいぢぎ;

.field public final なぎぱいぢぎ:Lcom/google/android/material/textfield/TextInputLayout$ぁごぐすすぃ;

.field public final びぐびあび:Landroid/text/TextWatcher;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .registers 2

    invoke-direct {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;)V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;->びぐびあび:Landroid/text/TextWatcher;

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$〺つふすそ;

    invoke-direct {p1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$〺つふすそ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;)V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;->づざかべべ:Lcom/google/android/material/textfield/TextInputLayout$なぎぱいぢぎ;

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$くし〴〺ぅ;

    invoke-direct {p1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$くし〴〺ぅ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;)V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;->なぎぱいぢぎ:Lcom/google/android/material/textfield/TextInputLayout$ぁごぐすすぃ;

    return-void
.end method

.method public static づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;)Z
    .registers 1

    .line 1
    iget-object p0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_12

    invoke-virtual {p0}, Landroid/widget/EditText;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object p0

    instance-of p0, p0, Landroid/text/method/PasswordTransformationMethod;

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    goto :goto_13

    :cond_12
    const/4 p0, 0x0

    :goto_13
    return p0
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->〺つふすそ:Landroid/content/Context;

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;->design_password_eye:I

    invoke-static {v1, v2}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/いいにぽつ;->password_toggle_content_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$びぐびあび;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ$びぐびあび;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;->づざかべべ:Lcom/google/android/material/textfield/TextInputLayout$なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->げつ〴ぬぐ(Lcom/google/android/material/textfield/TextInputLayout$なぎぱいぢぎ;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/ぇぬぎばつ;->なぎぱいぢぎ:Lcom/google/android/material/textfield/TextInputLayout$ぁごぐすすぃ;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->〴ねぷぐくぼ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_60

    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getInputType()I

    move-result v1

    const/16 v2, 0x10

    if-eq v1, v2, :cond_5e

    invoke-virtual {v0}, Landroid/widget/EditText;->getInputType()I

    move-result v1

    const/16 v2, 0x80

    if-eq v1, v2, :cond_5e

    invoke-virtual {v0}, Landroid/widget/EditText;->getInputType()I

    move-result v1

    const/16 v2, 0x90

    if-eq v1, v2, :cond_5e

    invoke-virtual {v0}, Landroid/widget/EditText;->getInputType()I

    move-result v1

    const/16 v2, 0xe0

    if-ne v1, v2, :cond_60

    :cond_5e
    const/4 v1, 0x1

    goto :goto_61

    :cond_60
    const/4 v1, 0x0

    :goto_61
    if-eqz v1, :cond_6a

    .line 4
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_6a
    return-void
.end method
