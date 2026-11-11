.class public Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 3

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    if-eqz p2, :cond_1d

    .line 1
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇ〳〲〺すっ:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    .line 4
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-nez p1, :cond_2d

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 5
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど:Landroid/widget/CheckBox;

    const/4 p2, 0x1

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_2d

    .line 7
    :cond_1d
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇ〳〲〺すっ:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 p2, 0x8

    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 9
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->おかぷせ〱:Landroid/widget/EditText;

    const-string p2, ""

    .line 10
    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_2d
    :goto_2d
    return-void
.end method
