.class public final Landroidx/core/app/JobIntentService$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/core/app/JobIntentService$づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/JobIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Landroidx/core/app/JobIntentService;

.field public final げつ〴ぬぐ:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroidx/core/app/JobIntentService;Landroid/content/Intent;I)V
    .registers 4

    iput-object p1, p0, Landroidx/core/app/JobIntentService$びぐびあび;->くし〴〺ぅ:Landroidx/core/app/JobIntentService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/core/app/JobIntentService$びぐびあび;->げつ〴ぬぐ:Landroid/content/Intent;

    iput p3, p0, Landroidx/core/app/JobIntentService$びぐびあび;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public getIntent()Landroid/content/Intent;
    .registers 2

    iget-object v0, p0, Landroidx/core/app/JobIntentService$びぐびあび;->げつ〴ぬぐ:Landroid/content/Intent;

    return-object v0
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Landroidx/core/app/JobIntentService$びぐびあび;->くし〴〺ぅ:Landroidx/core/app/JobIntentService;

    iget v1, p0, Landroidx/core/app/JobIntentService$びぐびあび;->〺つふすそ:I

    invoke-virtual {v0, v1}, Landroid/app/Service;->stopSelf(I)V

    return-void
.end method
