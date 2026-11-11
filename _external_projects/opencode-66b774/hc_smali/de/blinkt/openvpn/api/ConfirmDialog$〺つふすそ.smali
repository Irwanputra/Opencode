.class public Lde/blinkt/openvpn/api/ConfirmDialog$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/blinkt/openvpn/api/ConfirmDialog;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lde/blinkt/openvpn/api/ConfirmDialog;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/api/ConfirmDialog;)V
    .registers 2

    iput-object p1, p0, Lde/blinkt/openvpn/api/ConfirmDialog$〺つふすそ;->げつ〴ぬぐ:Lde/blinkt/openvpn/api/ConfirmDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .registers 4

    iget-object p1, p0, Lde/blinkt/openvpn/api/ConfirmDialog$〺つふすそ;->げつ〴ぬぐ:Lde/blinkt/openvpn/api/ConfirmDialog;

    .line 1
    iget-object v0, p1, Lde/blinkt/openvpn/api/ConfirmDialog;->びぐびあび:Landroid/app/AlertDialog;

    const/4 v1, -0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    .line 3
    iput-object v0, p1, Lde/blinkt/openvpn/api/ConfirmDialog;->くし〴〺ぅ:Landroid/widget/Button;

    .line 4
    iget-object p1, p0, Lde/blinkt/openvpn/api/ConfirmDialog$〺つふすそ;->げつ〴ぬぐ:Lde/blinkt/openvpn/api/ConfirmDialog;

    .line 5
    iget-object p1, p1, Lde/blinkt/openvpn/api/ConfirmDialog;->くし〴〺ぅ:Landroid/widget/Button;

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method
