.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic 〺つふすそ:Lde/blinkt/openvpn/LaunchVPN;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/LaunchVPN;)V
    .registers 2

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lde/blinkt/openvpn/LaunchVPN;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lde/blinkt/openvpn/LaunchVPN;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
