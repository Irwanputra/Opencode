.class public Landroidx/activity/ComponentActivity$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/ComponentActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/activity/ComponentActivity;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;)V
    .registers 2

    iput-object p1, p0, Landroidx/activity/ComponentActivity$3;->げつ〴ぬぐ:Landroidx/activity/ComponentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 3

    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_DESTROY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_15

    iget-object p1, p0, Landroidx/activity/ComponentActivity$3;->げつ〴ぬぐ:Landroidx/activity/ComponentActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_15

    iget-object p1, p0, Landroidx/activity/ComponentActivity$3;->げつ〴ぬぐ:Landroidx/activity/ComponentActivity;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->は〲ぱなで()Lづざかべべ/のぷのちつ/は〲ぱなで;

    move-result-object p1

    invoke-virtual {p1}, Lづざかべべ/のぷのちつ/は〲ぱなで;->げつ〴ぬぐ()V

    :cond_15
    return-void
.end method
