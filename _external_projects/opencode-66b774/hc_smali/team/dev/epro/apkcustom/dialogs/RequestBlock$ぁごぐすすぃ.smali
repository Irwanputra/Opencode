.class public Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 3

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    if-eqz p2, :cond_24

    .line 1
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->でどあくず:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぶでにく〼〳:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 5
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    .line 6
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-nez p1, :cond_32

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 7
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど:Landroid/widget/CheckBox;

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_32

    .line 9
    :cond_24
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->でどあくず:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 p2, 0x8

    .line 10
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 11
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぶでにく〼〳:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_32
    :goto_32
    return-void
.end method
