.class public Lteam/dev/epro/apkcustom/dialogs/ServerMessage;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# static fields
.field public static final synthetic ごづごきえ:I


# instance fields
.field public ぉざぅち〻:Landroid/widget/TextView;

.field public ざとぅぼこ〺:Landroid/widget/Button;

.field public は〲ぱなで:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0024

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f090181

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage;->ぉざぅち〻:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_31

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage;->ぉざぅち〻:Landroid/widget/TextView;

    const-string v1, "@kl\u001c0n\u001ckfIfgJj=Igj\u001d4jK7l\u001a0=NjjKk"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_31
    const p1, 0x7f0900b8

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage;->ざとぅぼこ〺:Landroid/widget/Button;

    const p1, 0x7f0900b9

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage;->は〲ぱなで:Landroid/widget/ImageView;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage;->ざとぅぼこ〺:Landroid/widget/Button;

    new-instance v0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/dialogs/ServerMessage$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/dialogs/ServerMessage;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage;->は〲ぱなで:Landroid/widget/ImageView;

    new-instance v0, Lteam/dev/epro/apkcustom/dialogs/ServerMessage$〺つふすそ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/dialogs/ServerMessage$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/dialogs/ServerMessage;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
