.class public Lcom/google/android/material/textfield/TextInputLayout$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/TextInputLayout;->setEditText(Landroid/widget/EditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 1
    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->ひぞ〴つき:Z

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->ぇ〳〲〺すっ(ZZ)V

    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->ぺぁあねじ:Z

    if-eqz v1, :cond_17

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->ごづごきえ(I)V

    :cond_17
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->ぇぬぎばつ:Z

    if-eqz v1, :cond_24

    .line 5
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->びえぁぜい(I)V

    :cond_24
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    return-void
.end method
