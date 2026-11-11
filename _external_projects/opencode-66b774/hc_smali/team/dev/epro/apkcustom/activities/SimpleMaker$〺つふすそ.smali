.class public Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/activities/SimpleMaker;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 5

    const/4 p1, 0x0

    const-string v0, ""

    const/16 v1, 0x8

    if-eqz p2, :cond_32

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 1
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 3
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    .line 4
    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 5
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->おかぷせ〱:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 7
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 9
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    const-string p2, "\u0019f;I7:\u001d6nIc9I3hOjnLjk\u001dao\u001c`nK`9N1hId=A4gK1:A1i\u001dkn\u001c4l\u001c3=\u001b79Og>J1;L"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_63

    .line 10
    :cond_32
    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 11
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 13
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    .line 14
    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 15
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    .line 16
    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 17
    iget-object p2, p2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->おかぷせ〱:Lcom/google/android/material/textfield/TextInputLayout;

    .line 18
    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 19
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    .line 20
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 21
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    const-string p2, "A`9Jg:AenN1<Ndj\u00197:@kjOjj\u001b4fJ4g\u0019bi\u001e7fI`oH1nL1l\u001ebo\u001e0=A7h\u00190>\u001d1n\u001bf=L"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 22
    :goto_63
    invoke-virtual {p1, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method
