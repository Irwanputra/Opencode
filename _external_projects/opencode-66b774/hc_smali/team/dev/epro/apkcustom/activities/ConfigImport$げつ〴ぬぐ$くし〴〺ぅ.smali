.class public Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:[Ljava/io/File;

.field public final synthetic くし〴〺ぅ:Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;[Ljava/io/File;)V
    .registers 3

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;

    iput-object p2, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:[Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .registers 4

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;

    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:[Ljava/io/File;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/ConfigImport;Ljava/lang/String;)V

    return-void
.end method
