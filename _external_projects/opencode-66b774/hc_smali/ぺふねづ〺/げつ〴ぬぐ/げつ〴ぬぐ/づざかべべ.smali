.class public Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Ljava/lang/String;

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Ljava/lang/String;

.field public づざかべべ:Ljava/lang/String;

.field public なぎぱいぢぎ:[Ljava/lang/String;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "positiveButton"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    const-string v0, "negativeButton"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    const-string v0, "rationaleMsg"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->づざかべべ:Ljava/lang/String;

    const-string v0, "theme"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    const-string v0, "requestCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->びぐびあび:I

    const-string v0, "permissions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[Ljava/lang/String;

    return-void
.end method
